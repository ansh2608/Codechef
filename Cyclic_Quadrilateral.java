import java.util.Scanner;

public class Cyclic_Quadrilateral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i<t; i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            if(a+c==180 && b+d==180)
            {
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
