import java.util.Scanner;

public class Chef_and_Three_Dogs {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0){
            double s = sc.nextDouble();
            double v = sc.nextDouble();
            System.out.printf("%.6f\n", (2*s)/(3*v));
        }
    }
}
