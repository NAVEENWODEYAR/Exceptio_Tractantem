package com.gowri.system.design;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Demonstrates a simple Rate Limiter using the Token Bucket Algorithm.
 * 
 * The Token Bucket algorithm works as follows:
 * - A bucket holds tokens up to a maximum capacity.
 * - Tokens are added to the bucket at a fixed refill rate per second.
 * - When a request arrives, it tries to consume a token. 
 * - If a token is available, the request is allowed (acquired).
 * - If no tokens are available, the request is rate-limited (rejected).
 * 
 * @author NaveenWodeyar
 * @date 24-Oct-2026 12:39:54 am
 */
public class RateLimiterDemo {

    /**
     * A thread-safe Token Bucket Rate Limiter implementation.
     */
    public static class TokenBucketRateLimiter {
        private final long capacity;          // Maximum tokens the bucket can hold
        private final double refillRate;      // Tokens added per second
        private double availableTokens;       // Current tokens in the bucket
        private long lastRefillTimestamp;     // Last time tokens were refilled (in milliseconds)
        
        private final ReentrantLock lock = new ReentrantLock();

        /**
         * Constructor to initialize the rate limiter.
         * 
         * @param capacity   Maximum burst capacity of the bucket
         * @param refillRate Number of tokens refilled per second
         */
        public TokenBucketRateLimiter(long capacity, double refillRate) {
            this.capacity = capacity;
            this.refillRate = refillRate;
            this.availableTokens = capacity; // Start with a full bucket
            this.lastRefillTimestamp = System.currentTimeMillis();
        }

        /**
         * Tries to acquire a token for an incoming request.
         * 
         * @return true if the request is allowed, false if rate-limited
         */
        public boolean tryAcquire() {
            lock.lock();
            try {
                refill();

                if (availableTokens >= 1.0) {
                    availableTokens -= 1.0; // Consume one token
                    return true;
                }
                
                return false; // Rate limited
            } finally {
                lock.unlock();
            }
        }

        /**
         * Refills tokens based on the elapsed time since the last refill.
         */
        private void refill() {
            long now = System.currentTimeMillis();
            long elapsedTimeMillis = now - lastRefillTimestamp;

            // If time has elapsed, calculate tokens to add
            if (elapsedTimeMillis > 0) {
                double tokensToAdd = (elapsedTimeMillis / 1000.0) * refillRate;
                
                // Add tokens but cap at maximum capacity
                availableTokens = Math.min(capacity, availableTokens + tokensToAdd);
                lastRefillTimestamp = now;
            }
        }
    }

    /**
     * Main method to simulate incoming requests and demonstrate rate limiting.
     */
    public static void main(String[] args) throws InterruptedException {
        // Create a rate limiter with:
        // - Capacity of 5 tokens (allows bursts up to 5 requests)
        // - Refill rate of 2 tokens per second
        TokenBucketRateLimiter rateLimiter = new TokenBucketRateLimiter(5, 2.0);

        System.out.println("=== Starting Rate Limiter Demo ===");
        System.out.println("Configuration: Capacity = 5 tokens, Refill Rate = 2 tokens/sec\n");

        // Simulate 12 rapid-fire requests
        for (int i = 1; i <= 12; i++) {
            boolean allowed = rateLimiter.tryAcquire();
            
            if (allowed) {
                System.out.println("[ALLOWED] Request " + i + " processed successfully.");
            } else {
                System.out.println("[BLOCKED] Request " + i + " rate limited! Too many requests.");
            }

            // Small delay between requests to simulate incoming traffic
            Thread.sleep(200); // 200 ms delay (5 requests per second incoming rate)
        }

        System.out.println("\n--- Pausing for 2 seconds to allow token refill ---");
        Thread.sleep(2000); // Wait 2 seconds (should refill ~4 tokens)

        System.out.println("\n=== Resuming Requests After Pause ===");
        
        // Simulate another 5 requests after the pause
        for (int i = 13; i <= 17; i++) {
            boolean allowed = rateLimiter.tryAcquire();
            
            if (allowed) {
                System.out.println("[ALLOWED] Request " + i + " processed successfully.");
            } else {
                System.out.println("[BLOCKED] Request " + i + " rate limited! Too many requests.");
            }
            
            Thread.sleep(100);
        }
    }
}
