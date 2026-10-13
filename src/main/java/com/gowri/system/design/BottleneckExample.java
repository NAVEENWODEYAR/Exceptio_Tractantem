package com.gowri.system.design;

/**
 * /**
 * @author NaveenWodeyar
 * @date 12-Oct-2026 11:23:44 pm
 * Demonstrates a system bottleneck.
 *
 * <p>A bottleneck is the component that limits
 * the overall performance of a system.
 *
 * <p>For a sequential workflow, improving a non-bottleneck
 * component may have little effect on total performance.
 *
 * <p>Why it matters:
 * Finding and optimizing bottlenecks is usually more effective
 * than optimizing random parts of a system.
 */
public class BottleneckExample {

    public static void main(String[] args) {

        service("API", 20);
        service("Cache", 5);
        service("Database", 100);
    }

    /**
     * Prints the simulated processing time of a component.
     */
    private static void service(
            String name,
            long milliseconds) {

        System.out.println(
                name + ": " + milliseconds + " ms"
        );
    }
}