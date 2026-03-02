@@ -6,32 +6,30 @@ public static void main(String[] args) {
    System.out.print("Input text : ");
    String input = sc.nextLine();
    Stack<Character> st = new Stack<>();
    for(int i = 0 ; i < input.length();i++){
        st.push(input.charAt(i));
        Queue<Character> q = new LinkedList<>();
        for(char c : input.toCharArray()){
            q.add(c);
            st.push(c);
        }
//        System.out.println(st);
        StringBuilder sb = new StringBuilder();
        while(st.size()!=0){
            sb.append((st.pop()));
        }
        String reverse = sb.toString();
        if(input.equals(reverse)){
            System.out.println("Is Palindrome? true");
        }else{
            System.out.println("Is Palindrome? false");
            Queue<Character> q = new LinkedList<>();
            Deque<Character> dq = new ArrayDeque<>();
            boolean palindrome = true;

            boolean palindrome = true;
            while(q.size()>0){
                if(q.poll() != st.pop()){
                    palindrome = false;
                    break;
                }
            }
            System.out.println("Is Palindrom? :" +palindrome);
            for(char c : input.toCharArray()){
                q.add(c);
                st.push(c);
                dq.addLast(c);
            }

            boolean palindrome = true;
            while(q.size()>0){
                if(q.poll() != st.pop()){
                    palindrome = false;
                    break;
                }
            }
            while(dq.size() > 1){
                char first = dq.removeFirst();
                char second = dq.removeLast();
                if(first != second) palindrome = false;
                break;
            }
            System.out.println("Is Palindrom? :" +palindrome);

            System.out.println("Is Palindrome? :" + palindrome);
        }
    }
}