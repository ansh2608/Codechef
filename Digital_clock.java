import java.util.Scanner;

public class Digital_clock {
    static final long MODULO= 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while(testCases-->0){
            int h = sc.nextInt();
            int m = sc.nextInt();
            int count = 1;
            for (int dig = 1; dig <= 9; dig++) {
                int hc = 0, mc = 0;
                if (dig < h) hc++;
                if (dig * 11 < h) hc++;
                if (dig < m) mc++;
                if (dig * 11 < m) mc++;
                count += hc*mc;
            }
            System.out.println(count);
        }
    }
}
