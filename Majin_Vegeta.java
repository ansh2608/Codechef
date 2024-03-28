import java.util.Scanner;

public class Majin_Vegeta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        final int MAX = 1000001;
        int[] totalPrimeFactors = new int[MAX];
        precomputeTotalPrimeFactors(MAX, totalPrimeFactors);
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long add = 0;
            for (int i = n; i < m; i++) add += totalPrimeFactors[i];
            System.out.println(add);
        }
    }
    static void precomputeTotalPrimeFactors(final int MAX, int[] totalPrimeFactors) {
        for (int i = 2; i < MAX; i++) {
            if (totalPrimeFactors[i] == 0) {
                for (int j = i; j < MAX; j += i) totalPrimeFactors[j]++;
            }
        }
    }
}
