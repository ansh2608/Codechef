import java.util.Scanner;

public class Cup_Finals {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int t =sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();

            if(Math.abs(a-b)<=d)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }
    }
}
