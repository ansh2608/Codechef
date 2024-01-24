import java.util.Scanner;

public class Maximise_the_Tastiness {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            if (a > b) {
                if (c > d) System.out.println(a + c);
                else System.out.println(a + d);
            }
            else if (a < b) {
                if (c > d) System.out.println(b + c);
                else System.out.println(b + d);
            }
            else System.out.println(a + c);
        }
    }
}
