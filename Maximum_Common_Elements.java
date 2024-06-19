import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Common_Elements {
    public static int countCommonElements(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0, j = 0, count = 0;

        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                count++;
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            for (int i = 0; i < N; i++) {
                B[i] = scanner.nextInt();
            }

            System.out.println(countCommonElements(A, B));
        }

        scanner.close();
    }
}