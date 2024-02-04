import java.util.Scanner;

public class Water_Mixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(a<=b && (b-a)<=x) System.out.println("yes");
            else if(a>=b && (a-b)<=y) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
