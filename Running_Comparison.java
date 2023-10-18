import java.util.Scanner;

public class Running_Comparison {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = sc.nextInt();
            }
            for (int j = 0; j < N; j++) {
                B[j] = sc.nextInt();
            }
            int count = 0;
            for (int k = 0; k < N; k++) {
                if (A[k] <= 2 * B[k] && B[k] <= 2 * A[k]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
