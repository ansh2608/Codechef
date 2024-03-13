import java.util.Scanner;

public class HTML_Tags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0 ) {
            String s = sc.next();
            if (s.length() < 4) System.out.println("Error");
            else if (s.charAt(0) != '<' || s.charAt(s.length() - 1) != '>' || s.charAt(1) != '/')
                System.out.println("Error");
            else {
                boolean flag = true;
                for (int i = 2; i < s.length() - 1; i++) {
                    if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) continue;
                    else {
                        flag = false;
                        break;
                    }
                }
                if (flag) System.out.println("Success");
                else System.out.println("Error");
            }
        }
    }
}
