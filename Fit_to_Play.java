import java.util.*;

public class Fit_to_Play {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int[] g=new int[n];
            for (int i=0;i<n;i++) g[i]=sc.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            int max = 0;
            for( int i = n - 1 ; i >= 0 ; i-- ){
                max = Math.max( g[i] , max );
                map.put( i , max );
            }
            int diff = 0;
            for( int i = 0 ; i < n ; i++ ) diff = Math.max( diff , map.get(i) - g[i] );
            if( diff == 0 ) System.out.println("UNFIT");
            else System.out.println( diff );
        }
    }
}
