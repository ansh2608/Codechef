import java.util.*;

public class Multivitamin_Tablets {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0; i<t; i++){
            int x = read.nextInt();
            int y = read.nextInt();
            if(y >= 3*x) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
