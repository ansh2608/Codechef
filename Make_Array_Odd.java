import java.util.Scanner;

public class Make_Array_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
    static void solve(Scanner sc) {
        long n = sc.nextLong();
        long x = sc.nextLong();
        long even = 0;
        long[] a = new long[(int) n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] % 2 == 0)
                even++;
        }
        if (x % 2 == 1) {
            if (even % 2 == 1)
                System.out.println(even / 2 + 1);
            else
                System.out.println(even / 2);
        } else {
            if (even != n)
                System.out.println(even);
            else
                System.out.println(-1);
        }
    }
}
