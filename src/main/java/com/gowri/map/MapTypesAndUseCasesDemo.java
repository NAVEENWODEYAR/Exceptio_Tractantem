package com.gowri.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Demonstrates all major Java Map implementations and their live environment use cases
 * in a single executable program.
 * 
 * @author NaveenWodeyar
 * @date 26-Oct-2026
 */
public class MapTypesAndUseCasesDemo {

    // Enum used for EnumMap demonstration
    public enum ServiceStatus {
        HEALTHY, 
        DEGRADED, 
        DOWN, 
        MAINTENANCE
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       JAVA MAP TYPES & LIVE USE CASES DEMO        ");
        System.out.println("==================================================\n");

        demonstrateHashMap();
        demonstrateLinkedHashMap();
        demonstrateTreeMap();
        demonstrateConcurrentHashMap();
        demonstrateWeakHashMap();
        demonstrateEnumMap();
    }

    /**
     * 1. HashMap: Standard O(1) lookups for configuration / feature flags.
     */
    private static void demonstrateHashMap() {
        System.out.println("--- 1. HashMap (Use Case: Feature Flags / Config Engine) ---");
        Map<String, Boolean> featureFlags = new HashMap<>();
        
        // Populate flags
        featureFlags.put("enableNewCheckout", true);
        featureFlags.put("darkTheme", false);
        featureFlags.put("betaAI", true);

        // Fast O(1) lookup
        boolean isCheckoutEnabled = featureFlags.getOrDefault("enableNewCheckout", false);
        System.out.println("Is New Checkout Enabled? " + isCheckoutEnabled);
        System.out.println("All Flags: " + featureFlags + "\n");
    }

    /**
     * 2. LinkedHashMap: Preserves insertion order (Use Case: Audit trails / ordered logs).
     */
    private static void demonstrateLinkedHashMap() {
        System.out.println("--- 2. LinkedHashMap (Use Case: Ordered Audit Trail) ---");
        // Maintains insertion order
        Map<String, String> auditTrail = new LinkedHashMap<>();
        
        auditTrail.put("10:00:01", "User Logged In");
        auditTrail.put("10:05:22", "Item Added to Cart");
        auditTrail.put("10:12:45", "Checkout Initiated");

        System.out.println("Chronological Audit Trail (Insertion Order preserved):");
        auditTrail.forEach((time, action) -> System.out.println("  [" + time + "] " + action));
        System.out.println();
    }

    /**
     * 3. TreeMap: Keys are sorted naturally or by comparator (Use Case: Range queries / Leaderboards).
     */
    private static void demonstrateTreeMap() {
        System.out.println("--- 3. TreeMap (Use Case: Sorted Leaderboards / Price Ranges) ---");
        // Automatically sorts keys alphabetically / numerically
        TreeMap<Integer, String> leaderboard = new TreeMap<>();
        
        leaderboard.put(1500, "Alice");
        leaderboard.put(3200, "Naveen");
        leaderboard.put(900, "Bob");
        leaderboard.put(2100, "Charlie");

        System.out.println("Full Leaderboard (Sorted by Score): " + leaderboard);
        
        // Range Query: Find players with scores between 1000 and 3000
        SortedMap<Integer, String> subMap = leaderboard.subMap(1000, 3000);
        System.out.println("Players with scores [1000, 3000): " + subMap);
        System.out.println("Top Player: " + leaderboard.lastKey() + " (" + leaderboard.get(leaderboard.lastKey()) + ")\n");
    }

    /**
     * 4. ConcurrentHashMap: Thread-safe high performance map (Use Case: Live metrics counter / Web Sessions).
     */
    private static void demonstrateConcurrentHashMap() {
        System.out.println("--- 4. ConcurrentHashMap (Use Case: API Endpoint Hit Counters) ---");
        ConcurrentHashMap<String, AtomicInteger> apiMetrics = new ConcurrentHashMap<>();

        // Simulating multiple threads hitting endpoints concurrently
        String endpoint = "/api/v1/users";
        
        // safely initialize or fetch counter
        apiMetrics.computeIfAbsent(endpoint, k -> new AtomicInteger(0)).incrementAndGet();
        apiMetrics.computeIfAbsent(endpoint, k -> new AtomicInteger(0)).incrementAndGet();
        apiMetrics.computeIfAbsent("/api/v1/orders", k -> new AtomicInteger(0)).incrementAndGet();

        System.out.println("API Hit Counts (Thread-safe):");
        apiMetrics.forEach((ep, count) -> System.out.println("  Endpoint: " + ep + " => Hits: " + count.get()));
        System.out.println();
    }

    /**
     * 5. WeakHashMap: Keys are weakly referenced (Use Case: Memory-sensitive metadata caching).
     */
    private static void demonstrateWeakHashMap() {
        System.out.println("--- 5. WeakHashMap (Use Case: Memory-Sensitive Metadata Cache) ---");
        Map<CachedKey, String> weakCache = new WeakHashMap<>();

        CachedKey key1 = new CachedKey("UserSession_101");
        weakCache.put(key1, "Cached Metadata Payload");

        System.out.println("Cache before GC: " + weakCache.get(key1));

        // If key1 is dereferenced and Garbage Collection runs, the entry is automatically dropped.
        key1 = null; 
        System.gc(); // Suggesting GC (Note: JVM GC behavior is non-deterministic)

        System.out.println("Cache size after key dereference & GC hint: " + weakCache.size());
        System.out.println("(If the key was collected, map becomes empty automatically)\n");
    }

    /**
     * Helper class for WeakHashMap demo.
     */
    static class CachedKey {
        private final String id;
        public CachedKey(String id) { this.id = id; }
        @Override public String toString() { return id; }
    }

    /**
     * 6. EnumMap: Highly optimized for Enum keys (Use Case: State machines / Status routing).
     */
    private static void demonstrateEnumMap() {
        System.out.println("--- 6. EnumMap (Use Case: Microservice Status Routing) ---");
        // Requires all keys to belong to the specified Enum type (super-fast array-backed internal storage)
        Map<ServiceStatus, String> statusActions = new EnumMap<>(ServiceStatus.class);

        statusActions.put(ServiceStatus.HEALTHY, "Route traffic normally.");
        statusActions.put(ServiceStatus.DEGRADED, "Enable circuit breaker & alert on-call.");
        statusActions.put(ServiceStatus.DOWN, "Failover to backup region.");
        statusActions.put(ServiceStatus.MAINTENANCE, "Display maintenance splash page.");

        System.out.println("Action for DEGRADED state: " + statusActions.get(ServiceStatus.DEGRADED));
        System.out.println("Full Status Actions Map (Sorted by Enum declaration order): " + statusActions);
    }
}
