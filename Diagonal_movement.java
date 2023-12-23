import java.util.Scanner;

public class Diagonal_movement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int a=s.nextInt();
            int b=s.nextInt();
            if((a+b)%2==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
