import java.util.Scanner;

public class Exactly_N_plus_1_Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long sum = 1;
            long val = 1;
            System.out.print(val + " ");
            for(int i=0; i<n-1; i++) {
                System.out.print(val + " ");
                sum += val;
                val++;
            }
            System.out.println((long)Math.pow(2, n) - sum);
        }
    }
}
