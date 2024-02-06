import java.util.Scanner;

public class Minimum_number_of_coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int x=sc.nextInt();
            int x1=x/10,x2=x%10,x3=x2/5;
            if (x%10==0) System.out.println(x1);
            else if (x%5==0) System.out.println(x1+x3);
            else System.out.println(-1);
        }
    }
}
