import java.util.Scanner;

public class Determine_the_Score {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int eachTestPoint = x/10;
            int score = eachTestPoint*y;
            System.out.println(score);
        }
    }
}
