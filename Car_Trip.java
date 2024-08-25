import java.util.Scanner;

public class Car_Trip {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-- > 0){
            int a=s.nextInt();
            if(a<=300) System.out.println("3000");
            else System.out.println(a*10);
        }
    }
}
