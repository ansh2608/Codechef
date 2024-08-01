import java.util.Scanner;

public class Messi_vs_Ronaldo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int messi = a*2+b;
        int ronaldo = x*2+y;
        if(messi==ronaldo) System.out.println("Equal");
        else if(messi>ronaldo) System.out.println("Messi");
        else System.out.println("Ronaldo");
    }
}
