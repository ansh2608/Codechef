import java.util.Scanner;

public class Police_and_Thief {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0) {
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println(Math.abs(y-x));
        }
    }
}
