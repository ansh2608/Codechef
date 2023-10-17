import java.util.Scanner;
public class cost_of_Groceries {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = sc.nextInt();
            }
            for (int j = 0; j < N; j++) {
                B[j] = sc.nextInt();
            }
            int total = 0;
            int k = 0;
            while (N > k) {
                if (A[k] >= X) {
                    total += B[k];
                }
                k += 1;
            }
            System.out.println(total);
        }
    }
}
