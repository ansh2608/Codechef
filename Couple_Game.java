import java.util.Scanner;

public class Couple_Game {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for(int i=1;i<=T;i++){
            int b=in.nextInt();
            int g=in.nextInt();
            System.out.println(g-b);
        }
    }
}
