import java.util.*;

public class Transform_the_Expression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        while (f--!=0){
            String str=sc.next();
            Stack<String> val=new Stack<>();
            Stack<Character> op=new Stack<>();
            for (int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if ((int)ch>=97 && (int)ch<=122) {
                    String s=""+ch;
                    val.push(s);
                }
                else if (op.isEmpty() || ch=='(' || op.peek()=='(') op.push(ch);
                else if (ch==')'){
                    while (op.peek()!='('){
                        String v2=val.pop();
                        String v1=val.pop();
                        char O=op.pop();
                        String t=v1+v2+O;
                        val.push(t);
                    }
                    op.pop();
                }
                else {
                    if (ch=='+' || ch=='-'){
                        String v2=val.pop();
                        String v1=val.pop();
                        char O=op.pop();
                        String t=v1+v2+O;
                        val.push(t);
                        op.push(ch);
                    }
                    if (ch=='*' || ch=='/'){
                        if (op.peek()=='*' || op.peek()=='/'){
                            String v2=val.pop();
                            String v1=val.pop();
                            char O=op.pop();
                            String t=v1+v2+O;
                            val.push(t);
                            op.push(ch);
                        }
                        else op.push(ch);
                    }
                }
            }
            while (val.size()>1){
                String v2=val.pop();
                String v1=val.pop();
                char O=op.pop();
                String t=v1+v2+O;
                val.push(t);
            }
            System.out.println(val.peek());
        }
    }
}
