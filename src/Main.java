@@ -1,96 +1,104 @@
        import java.util.*;
/**
 * ==============================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ==============================================================
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution performance
 * of palindrome validation algorithms.
 *
 * Features:
 * - Uses 3 palindrome checking methods
 * - Captures execution start and end time
 * - Calculates execution duration
 * - Displays benchmarking results
 *
 * Goal:
 * Introduce benchmarking concepts and algorithm comparison.
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * Accepts input from command-line arguments.
     */
    public static void main(String[] args) {

// Strategy Interface
        interface PalindromeStrategy {
            boolean isPalindrome(String input);
        }
        if (args.length == 0) {
            System.out.println("Please provide a string input.");
            return;
        }

// Stack
        class StackStrategy implements PalindromeStrategy {
            public boolean isPalindrome(String input) {
                Stack<Character> stack = new Stack<>();
                String input = args[0];

                for (char c : input.toCharArray()) {
                    stack.push(c);
                }
                System.out.println("Input: " + input);
                System.out.println("----------------------------------");

                for (char c : input.toCharArray()) {
                    if (c != stack.pop()) {
                        return false;
                    }
                }
                return true;
            }
        }
        // Method 1: Reverse String Method
        long start1 = System.nanoTime();
        boolean result1 = isPalindromeUsingReverse(input);
        long end1 = System.nanoTime();

// Deque आधारित रणनीति
        class DequeStrategy implements PalindromeStrategy {
            public boolean isPalindrome(String input) {
                Deque<Character> deque = new ArrayDeque<>();
                // Method 2: Two Pointer Method
                long start2 = System.nanoTime();
                boolean result2 = isPalindromeUsingLoop(input);
                long end2 = System.nanoTime();

                for (char c : input.toCharArray()) {
                    deque.add(c);
                }
                // Method 3: Recursive Method
                long start3 = System.nanoTime();
                boolean result3 = isPalindromeRecursive(input, 0, input.length() - 1);
                long end3 = System.nanoTime();

                while (deque.size() > 1) {
                    if (deque.removeFirst() != deque.removeLast()) {
                        return false;
                    }
                }
                return true;
            }
        }
        // Results
        System.out.println("Method 1 (Reverse): " + result1 +
                " | Time: " + (end1 - start1) + " ns");

// Context Class
        class PalindromeChecker {
            private PalindromeStrategy strategy;
        System.out.println("Method 2 (Loop):    " + result2 +
                    " | Time: " + (end2 - start2) + " ns");

            public void setStrategy(PalindromeStrategy strategy) {
                this.strategy = strategy;
                System.out.println("Method 3 (Recursion): " + result3 +
                        " | Time: " + (end3 - start3) + " ns");
            }

            public boolean check(String input) {
                if (strategy == null) {
                    throw new IllegalStateException("Strategy not set");
                }
                return strategy.isPalindrome(input);
                // ------------------------------------------------------
                // Method 1: Reverse String Comparison
                // ------------------------------------------------------
                public static boolean isPalindromeUsingReverse(String str) {
                    String reversed = new StringBuilder(str).reverse().toString();
                    return str.equals(reversed);
                }
            }

            // Main Application
            public class UseCase12PalindromeCheckerApp {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    PalindromeChecker checker = new PalindromeChecker();

                    System.out.println("Enter a string:");
                    String input = sc.nextLine();

                    System.out.println("Choose Strategy:");
                    System.out.println("1. Stack Strategy");
                    System.out.println("2. Deque Strategy");

                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            checker.setStrategy(new StackStrategy());
                            break;
                        case 2:
                            checker.setStrategy(new DequeStrategy());
                            break;
                        default:
                            System.out.println("Invalid choice");
                            return;
                        // ------------------------------------------------------
                        // Method 2: Loop (Two-pointer technique)
                        // ------------------------------------------------------
                        public static boolean isPalindromeUsingLoop(String str) {
                            int left = 0;
                            int right = str.length() - 1;

                            while (left < right) {
                                if (str.charAt(left) != str.charAt(right))
                                    return false;
                                left++;
                                right--;
                            }
                            return true;
                        }

                        boolean result = checker.check(input);
                        // ------------------------------------------------------
                        // Method 3: Recursive Check
                        // ------------------------------------------------------
                        public static boolean isPalindromeRecursive(String str, int left, int right) {
                            if (left >= right)
                                return true;

                            if (result)
                                System.out.println("Palindrome");
                            else
                                System.out.println("Not a Palindrome");
                            if (str.charAt(left) != str.charAt(right))
                                return false;

                            sc.close();
                            return isPalindromeRecursive(str, left + 1, right - 1);
                        }
                    }