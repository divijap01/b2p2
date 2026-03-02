@@ -1,45 +1,51 @@
        import java.util.*;
        import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    // Class responsible only for palindrome logic (Single Responsibility Principle)
    class PalindromeChecker {

        static boolean palidrome(String s , int start , int end){
            if(start >= end) return  true;
            if(s.charAt(start)!=s.charAt(end)) return false;
            return palidrome(s,start+1,end -1);
            public static boolean isPalindrome(String input) {
                // Method to check palindrome using Stack (encapsulation)
                public boolean checkPalindrome(String input) {
                    String cleaned = input.replaceAll("\\s+", "").toLowerCase();

                    String normalized = input.toLowerCase().replaceAll("\\s+", "");
                    Stack<Character> stack = new Stack<>();

                    char[] charArray = normalized.toCharArray();

                    int left = 0;
                    int right = charArray.length - 1;
                    // Push characters to stack
                    for (char c : cleaned.toCharArray()) {
                        stack.push(c);
                    }

                    while (left < right) {
                        if (charArray[left] != charArray[right]) {
                            return false;
                        }
                        left++;
                        right--;
                        // Compare with reversed order from stack
                        for (char c : cleaned.toCharArray()) {
                            if (c != stack.pop()) {
                                return false;
                            }

                            return true;
                        }
                        return true;
                    }
                }

                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input text : ");
                    String input = sc.nextLine();
// Main application class
                    public class UseCase11PalindromeCheckerApp {

                        Scanner scanner = new Scanner(System.in);
                        public static void main(String[] args) {

                            System.out.print("Enter a string: ");
                            String input = scanner.nextLine();
                            System.out.println("Is Palindrom? :"+ isPalindrome(input));
                            Scanner scanner = new Scanner(System.in);
                            PalindromeChecker checker = new PalindromeChecker();

                            System.out.println("Is Palindrom? :"+ palidrome(input,0,input.length()-1));
                            System.out.println("Palindrome Checker App");
                            System.out.print("Enter a string: ");

                            sc.close();
                            scanner.close();
                            String input = scanner.nextLine();

                            boolean result = checker.checkPalindrome(input);

                            if (result) {
                                System.out.println("Result: The string IS a palindrome.");
                            } else {
                                System.out.println("Result: The string is NOT a palindrome.");
                            }
                        }

        scanner.close();
                    }
                }