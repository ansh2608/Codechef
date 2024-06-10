import java.util.Scanner;

public class Better_Deal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int d= 100-(a*(100/100));
            int e= 200-(b*(200/100));
            if(d > e) System.out.println("second");
            else if(e > d) System.out.println("first");
            else System.out.println("Both");
        }
    }
}
