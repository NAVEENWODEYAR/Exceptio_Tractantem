package com.gowri.system.design;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author NaveenWodeyar
 * @date 17-Nov-2026 8:44:25 am
 */

public class SlaDemo {

    // Define the SLA Threshold: Maximum allowed response time in milliseconds
    private static final long SLA_THRESHOLD_MS = 200;
    
    // Define the SLA Target Compliance Rate (e.g., 95% of requests must pass)
    private static final double TARGET_COMPLIANCE_RATE = 95.0;

    public static void main(String[] args) {
        System.out.println("=== Starting SLA Demonstration ===");
        System.out.println("SLA Rule: Response time must be <= " + SLA_THRESHOLD_MS + " ms.");
        System.out.println("Target Compliance: " + TARGET_COMPLIANCE_RATE + "%\n");

        List<Long> responseTimes = new ArrayList<>();
        Random random = new Random();
        int totalRequests = 50;
        int slaViolations = 0;

        // Simulate processing multiple requests
        for (int i = 1; i <= totalRequests; i++) {
            long startTime = System.currentTimeMillis();
            
            // Simulating work (e.g., database query or external API call)
            // Random execution time between 50ms and 320ms
            simulateServiceExecution(random);
            
            long duration = System.currentTimeMillis() - startTime;
            responseTimes.add(duration);

            // Check if this individual request violated the SLA
            if (duration > SLA_THRESHOLD_MS) {
                slaViolations++;
                System.out.printf("[VIOLATION] Request #%d took %d ms (Exceeded limit)%n", i, duration);
            } else {
                System.out.printf("[SUCCESS]   Request #%d took %d ms%n", i, duration);
            }
        }

        // Calculate Final Metrics
        int compliantRequests = totalRequests - slaViolations;
        double complianceRate = ((double) compliantRequests / totalRequests) * 100.0;

        // Print Summary Report
        System.out.println("\n========================================");
        System.out.println("          SLA COMPLIANCE REPORT         ");
        System.out.println("========================================");
        System.out.println("Total Requests       : " + totalRequests);
        System.out.println("Compliant Requests   : " + compliantRequests);
        System.out.println("SLA Violations       : " + slaViolations);
        System.out.printf("Actual Compliance    : %.2f%%%n", complianceRate);
        
        // Evaluate SLA status
        if (complianceRate >= TARGET_COMPLIANCE_RATE) {
            System.out.println("Status: [PASS] SLA terms successfully met.");
        } else {
            System.out.println("Status: [FAIL] SLA terms breached!");
        }
        System.out.println("========================================");
    }

    /**
     * Simulates varying processing time for a service call.
     */
    private static void simulateServiceExecution(Random random) {
        try {
            int processingTime = 50 + random.nextInt(270); // 50ms to 320ms
            Thread.sleep(processingTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}