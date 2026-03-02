@@ -68,30 +68,21 @@ static Node reverse(Node head) {
    current = nextNode;
}
        return prev;
    }
static boolean palidrome(String s , int start , int end){
    if(start >= end) return  true;
    if(s.charAt(start)!=s.charAt(end)) return false;
    return palidrome(s,start+1,end -1);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input text : ");
    String input = sc.nextLine();
    Deque<Character> dq = new ArrayDeque<>();
    boolean palindrome = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
        String input = sc.nextLine();

        for(char c : input.toCharArray()){
            dq.addLast(c);
        }
        while(dq.size() > 1){
            char first = dq.removeFirst();
            char second = dq.removeLast();
            if(first != second) palindrome = false;
            break;
        }
        System.out.println("Is Palindrome? :" + palindrome);
    }
}
Node head = createList(input);
        System.out.println("Is Palindrom? :"+isPalindrome(head));
Node head = createList(input);
            System.out.println("Is Palindrom? :"+isPalindrome(head));

        sc.close();
    }
            }
            System.out.println("Is Palindrom? :"+ palidrome(input,0,input.length()-1));

        sc.close();
        }