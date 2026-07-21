import java.util.*;

public class Moglix {


    public static int longestValidParanthesesSubstring(String str) {
                
        
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        st.push(-1); 

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == ')'){
                st.pop();

                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    int len = i - st.peek();
                    ans = Math.max(ans, len);
                }
                
            } else {
                st.push(i);
            }

        }

        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.nextLine();

        int result = longestValidParanthesesSubstring(input);
        System.out.println("Answer is -> " + result);

        sc.close();

    }
}