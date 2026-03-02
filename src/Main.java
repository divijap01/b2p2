@@ -1,88 +1,45 @@
        import java.util.*;

class Node {
    char data;
    Node next;
    public class PalindromeCheckerApp {

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    static boolean palidrome(String s , int start , int end){
        if(start >= end) return  true;
        if(s.charAt(start)!=s.charAt(end)) return false;
        return palidrome(s,start+1,end -1);
        public static boolean isPalindrome(String input) {

            public class PalindromeCheckerApp {
                String normalized = input.toLowerCase().replaceAll("\\s+", "");

                static Node createList(String str) {
                    Node head = null, tail = null;
                    char[] charArray = normalized.toCharArray();

                    for (char ch : str.toCharArray()) {
                        Node newNode = new Node(ch);
                        int left = 0;
                        int right = charArray.length - 1;

                        if (head == null) {
                            head = newNode;
                            tail = newNode;
                        } else {
                            tail.next = newNode;
                            tail = newNode;
                            while (left < right) {
                                if (charArray[left] != charArray[right]) {
                                    return false;
                                }
                                left++;
                                right--;
                            }
                        }
                        return head;
                    }

                    static boolean isPalindrome(Node head) {
                        if (head == null || head.next == null)
                            return true;

                        Node slow = head;
                        Node fast = head;


                        while (fast != null && fast.next != null) {
                            slow = slow.next;
                            fast = fast.next.next;
                        }


                        Node secondHalf = reverse(slow);
                        Node firstHalf = head;

                        while (secondHalf != null) {
                            if (firstHalf.data != secondHalf.data)
                                return false;

                            firstHalf = firstHalf.next;
                            secondHalf = secondHalf.next;
                        }

                        return true;
                    }

                    static Node reverse(Node head) {
                        Node prev = null;
                        Node current = head;

                        while (current != null) {
                            Node nextNode = current.next;
                            current.next = prev;
                            prev = current;
                            current = nextNode;
                        }
                        return prev;
                        static boolean palidrome(String s , int start , int end){
                            if(start >= end) return  true;
                            if(s.charAt(start)!=s.charAt(end)) return false;
                            return palidrome(s,start+1,end -1);
                        }

                        public static void main(String[] args) {
                            Scanner sc = new Scanner(System.in);
                            System.out.print("Input text : ");
                            String input = sc.nextLine();

                            Node head = createList(input);
                            System.out.println("Is Palindrom? :"+isPalindrome(head));
                            Scanner scanner = new Scanner(System.in);

                            System.out.print("Enter a string: ");
                            String input = scanner.nextLine();
                            System.out.println("Is Palindrom? :"+ isPalindrome(input));

                            System.out.println("Is Palindrom? :"+ palidrome(input,0,input.length()-1));

                            sc.close();
                        }
                        scanner.close();
                    }
                }