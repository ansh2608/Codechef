import java.util.Scanner;

public class Enormous_Input_Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x % k == 0) ans++;
        }
        System.out.println(ans);
    }
}
