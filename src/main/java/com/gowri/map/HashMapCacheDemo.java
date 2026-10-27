package com.gowri.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates a simple In-Memory Cache using a standard HashMap
 * with a Cache-Aside (Lazy Loading) pattern.
 * 
 * @author NaveenWodeyar
 * @date 26-Oct-2026
 */
public class HashMapCacheDemo {

    public static void main(String[] args) {
        System.out.println("=== HashMap Cache Demonstration (Cache-Aside Pattern) ===\n");
        
        UserService userService = new UserService();

        // 1. First fetch (Cache Miss) - Will fetch from simulated database
        System.out.println("--- Request 1 for User ID 101 ---");
        System.out.println("User Data: " + userService.getUserById(101));

        // 2. Second fetch (Cache Hit) - Will fetch instantly from the HashMap cache
        System.out.println("\n--- Request 2 for User ID 101 (Should hit cache) ---");
        System.out.println("User Data: " + userService.getUserById(101));

        // 3. Fetch another user (Cache Miss)
        System.out.println("\n--- Request for User ID 102 ---");
        System.out.println("User Data: " + userService.getUserById(102));
        
        // 4. View current cache state
        userService.printCacheState();
    }

    /**
     * Service layer that wraps the database and the HashMap cache.
     */
    static class UserService {
        // The underlying HashMap acting as our cache
        private final Map<Integer, String> cache = new HashMap<>();

        public String getUserById(int userId) {
            // Step 1: Check if data exists in cache (Cache Hit)
            if (cache.containsKey(userId)) {
                System.out.println("[CACHE HIT] Fetched user " + userId + " from memory.");
                return cache.get(userId);
            }

            // Step 2: If not in cache (Cache Miss), fetch from database
            System.out.println("[CACHE MISS] Querying Database for user " + userId + "...");
            String userData = fetchFromDatabase(userId);

            // Step 3: Store the result in the cache for future requests
            cache.put(userId, userData);
            
            return userData;
        }

        /**
         * Simulates a slow database query.
         */
        private String fetchFromDatabase(int userId) {
            // Simulating network/disk latency
            try { Thread.sleep(500); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            
            if (userId == 101) return "Naveen (Role: Admin)";
            if (userId == 102) return "Alice (Role: Developer)";
            return "Unknown User";
        }

        public void printCacheState() {
            System.out.println("\nCurrent Cache Contents: " + cache);
        }
    }
}
