import java.util.Scanner;

public class Minimum_Pizzas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int c=n*x;
            int d=c/4;
            if (c%4!=0) System.out.println(d+1);
            else System.out.println(d);
        }
    }
}
