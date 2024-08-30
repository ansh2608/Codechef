import java.util.Scanner;

public class Spice_Level {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            System.out.println( (x < 4) ? "MILD" : (x>=4 && x<7) ? "MEDIUM" : "HOT" );
        }
    }
}
