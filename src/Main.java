@@ -5,16 +5,13 @@ public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input text : ");
    String input = sc.nextLine();
    char arr[] = input.toCharArray();
    int n = input.length();
    boolean status = true;
    for(int i = 0 ; i < n/2 ; i++){
        if(arr[i] != arr[n - i - 1]){
            status = false;
        }
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < input.length();i++){
            st.push(input.charAt(i));
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
                @@ -26,12 +23,15 @@ public static void main(String[] args) {
                    System.out.println("Is Palindrome? true");
                }else{
                    System.out.println("Is Palindrome? false");
                }

                System.out.println("Is Palindrom: " + status);

                boolean palindrome = true;
                while(q.size()>0){
                    if(q.poll() != st.pop()){
                        palindrome = false;
                        break;
                    }
                }
                System.out.println("Is Palindrom? :" +palindrome);



            }
        }
    }
}