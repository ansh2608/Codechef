import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reversing_directions {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0 ){
            int n = Integer.parseInt(br.readLine());
            String[] a = new String[n];
            for (int i = 0 ; i < n ; i++ ){
                String st = br.readLine();
                a[i] = st;
            }
            String temp = a[n-1].split(" ")[0];
            String r =  a[n-1].replace(temp,"Begin");
            a[n-1] = r;
            for( int i = n - 2 ; i >= 0 ; i-- ){
                if( i == 0 ) a[i] =   a[i].replace( "Begin" , temp );
                String temp2 = a[i].split(" ")[0];
                a[i] =  a[i].replace( temp2 , temp.equals("Right") ? "Left" : "Right" );
                temp = temp2;
            }
            for( int i = n - 1 ; i >= 0 ; i-- ) System.out.println( a[i] );
        }
    }
}


