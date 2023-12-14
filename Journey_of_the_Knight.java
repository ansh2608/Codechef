import java.util.Scanner;

public class Journey_of_the_Knight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int a = Math.abs(x1 - x2);
            int b = Math.abs(y1 - y2);
            if ((a + b) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
