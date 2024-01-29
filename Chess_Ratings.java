import java.util.Scanner;

public class Chess_Ratings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=y-x;
            if (z%8==0) System.out.println(z/8);
            else System.out.println((z/8)+1);
        }
    }
}
