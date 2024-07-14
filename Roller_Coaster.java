import java.util.Scanner;

public class Roller_Coaster {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0){
            int x =s.nextInt();
            int h = s.nextInt();
            if(x>=h) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
