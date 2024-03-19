import java.util.Scanner;

public class Yet_another_SOD_problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long l = scanner.nextLong();
            long r = scanner.nextLong();
            System.out.println((r / 3) - ((l - 1) / 3));
        }
    }
}
