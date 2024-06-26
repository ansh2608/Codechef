import java.util.Scanner;

public class Masterchef_finals {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int n = sc.nextInt();
            if(n > 10) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
