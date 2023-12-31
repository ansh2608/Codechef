import java.util.Scanner;
import java.util.Stack;

public class Valid_Parenthesis {
    public static boolean isValid(String str){
        Stack<Character> st=new Stack<>();
        for (int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if (curr=='(') st.push(curr);
            else if (curr==')'){
                if (!st.isEmpty() && st.peek()=='(') st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            String str=sc.next();
            if (isValid(str)) System.out.println(1);
            else System.out.println(0);
        }
    }
}
