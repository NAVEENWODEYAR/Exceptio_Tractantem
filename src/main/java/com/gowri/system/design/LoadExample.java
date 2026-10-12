package com.gowri.system.design;

/**
 * 
 * @author NaveenWodeyar
 * @date 09-Oct-2026 12:43:21 am
 * 
 * Demonstrates system load.
 *
 * <p>Load is the amount of work currently being placed
 * on a system.
 *
 * <p>Examples:
 * <ul>
 *     <li>10,000 HTTP requests per second</li>
 *     <li>80% CPU utilization</li>
 *     <li>5,000 database queries per second</li>
 * </ul>
 *
 * <p>Why it matters:
 * Understanding load helps us determine whether a system
 * has enough capacity to handle incoming work.
 */
public class LoadExample {

    public static void main(String[] args) {

        int requests = 10_000;

        for (int request = 1; request <= requests; request++) {
            handleRequest(request);
        }

        System.out.println(
                "Processed " + requests + " requests."
        );
    }

    /**
     * Simulates processing one request.
     */
    private static void handleRequest(int requestId) {
        // Request processing would happen here.
    }
}