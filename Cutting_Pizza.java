import java.util.Scanner;

public class Cutting_Pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        while (T-- > 0) {
            int n = scanner.nextInt(); // Number of premade cuts
            int[] angles = new int[n];
            for (int i = 0; i < n; i++) {
                angles[i] = scanner.nextInt(); // Angles of the premade cuts
            }
            System.out.println(minAdditionalCuts(n, angles));
        }
        scanner.close();
    }

    // Function to find the smallest number of additional cuts required
    public static int minAdditionalCuts(int n, int[] angles) {
        int slices = 1;
        for (int i = 1; i < n; i++) {
            int diff = angles[i] - angles[i - 1];
            if (diff < 0) {
                diff += 360; // Handling negative differences
            }
            slices = gcd(slices, diff);
        }
        // Number of additional cuts needed = number of slices - 1
        return slices - 1;
    }

    // Function to find the greatest common divisor (GCD) using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
