package com.gowri.code;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates an LRU (Least Recently Used) Cache implementation 
 * with LeetCode-style test execution logic.
 * 
 * @author NaveenWodeyar
 * @date 16-Oct-2026
 */
public class LruCacheDemo {

    /**
     * Node structure for the Doubly Linked List.
     */
    private static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    
    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head;
    private final Node tail;

    /**
     * Initializes the LRU cache with a given capacity.
     * 
     * @param capacity The maximum number of items the cache can hold.
     */
    public LruCacheDemo(int capacity) {
    	
        this.capacity = capacity;
        this.map = new HashMap<>();
        
        // Dummy head and tail nodes to manage boundary conditions easily
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    /**
     * Returns the value of the key if it exists, otherwise returns -1.
     * Accessing an item makes it the most recently used.
     * 
     * @param key The key to look up.
     * @return The cached value, or -1 if not found.
     */
    public int get(int key) {
    	
        if (!map.containsKey(key)) {
            return -1;
        }
        
        Node node = map.get(key);
        moveToHead(node); // Mark as recently used
        return node.value;
    }

    /**
     * Updates or inserts a key-value pair. If capacity is exceeded, 
     * the least recently used item is evicted.
     * 
     * @param key The key to insert or update.
     * @param value The value associated with the key.
     */
    public void put(int key, int value) {
    	
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            if (map.size() >= capacity) {
                Node lru = removeTail(); // Evict least recently used item
                map.remove(lru.key);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToHead(newNode);
        }
    }
    

    // --- Helper Methods for Doubly Linked List Management ---
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private Node removeTail() {
        Node lru = tail.prev;
        removeNode(lru);
        return lru;
    }

    /**
     * Simulates LeetCode-style test cases to verify the cache behavior.
     * 
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        System.out.println("--- Starting LRU Cache Test Cases ---");

        // Test Case 1: Capacity of 2
        LruCacheDemo cache = new LruCacheDemo(2);

        cache.put(1, 1); // cache = {1=1}
        cache.put(2, 2); // cache = {1=1, 2=2}
        
        System.out.println("Get 1 (Expect 1): " + cache.get(1)); // returns 1
        
        cache.put(3, 3); // evicts key 2, cache = {1=1, 3=3}
        
        System.out.println("Get 2 (Expect -1, was evicted): " + cache.get(2)); // returns -1 (not found)
        
        cache.put(4, 4); // evicts key 1, cache = {3=3, 4=4}
        
        System.out.println("Get 1 (Expect -1, was evicted): " + cache.get(1)); // returns -1 (not found)
        System.out.println("Get 3 (Expect 3): " + cache.get(3)); // returns 3
        System.out.println("Get 4 (Expect 4): " + cache.get(4)); // returns 4

        System.out.println("--- Test Cases Completed Successfully ---");
    }
}