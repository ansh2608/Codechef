import java.util.Scanner;

public class Gcd_of_Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0 ){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long totalSubArrays = n*(n+1) / 2;
            if( totalSubArrays > k ) System.out.println(-1);
            else{
                StringBuilder s = new StringBuilder();
                for( int i = 1 ; i < n ; i++ ){
                    s.append("1");
                    s.append(" ");
                }
                long ans = k - totalSubArrays + 1;
                s.append( String.valueOf(ans) );
                System.out.println( s.toString() );
            }
        }
    }
}
