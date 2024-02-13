import java.util.Scanner;

public class Endless_Appetizers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int r=sc.nextInt();
            int c=x+(r/30);
            int d=c/y;
            if (c%y==0) System.out.println(d);
            else System.out.println(d+1);
        }
    }
}
