import java.util.Arrays;
import java.util.Scanner;

public class Triangle_Classification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int st = scanner.nextInt();
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int x3 = scanner.nextInt();
            int y3 = scanner.nextInt();
            double a = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
            double b = Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2);
            double c = Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2);
            double m = Math.abs(a - b);
            double n = Math.abs(a - c);
            double o = Math.abs(b - c);
            double[] f = { a, b, c };
            Arrays.sort(f);
            if (st == 1) {
                if (m > Math.pow(10, -6) && n > Math.pow(10, -6) && o > Math.pow(10, -6))
                    System.out.println("Scalene triangle");
                else if (m < Math.pow(10, -6) || n < Math.pow(10, -6) || o < Math.pow(10, -6))
                    System.out.println("Isosceles triangle");
            } else if (st == 2) {
                if (m > Math.pow(10, -6) && n > Math.pow(10, -6) && o > Math.pow(10, -6)) {
                    if (Math.abs(a - (b + c)) < Math.pow(10, -6) || Math.abs(b - (a + c)) < Math.pow(10, -6)
                            || Math.abs(c - (a + b)) < Math.pow(10, -6))
                        System.out.println("Scalene right triangle");
                    else if (f[2] > (f[0] + f[1]))
                        System.out.println("Scalene obtuse triangle");
                    else if (f[2] < (f[0] + f[1]))
                        System.out.println("Scalene acute triangle");
                } else if (m < Math.pow(10, -6) || n < Math.pow(10, -6) || o < Math.pow(10, -6)) {
                    if (Math.abs(a - (b + c)) < Math.pow(10, -6) || Math.abs(b - (a + c)) < Math.pow(10, -6)
                            || Math.abs(c - (a + b)) < Math.pow(10, -6))
                        System.out.println("Isosceles right triangle");
                    else if (f[2] > (f[0] + f[1]))
                        System.out.println("Isosceles obtuse triangle");
                    else if (f[2] < (f[0] + f[1]))
                        System.out.println("Isosceles acute triangle");
                }
            }
        }
    }
}
