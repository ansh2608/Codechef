import java.util.Scanner;

public class A_or_B {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0)
        {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = 500-(a*2);
            int e=1000-(b+a)*4;
            int d = 1000-(b*4);
            int f = 500-(a+b)*2;

            if((c+e)>=(d+f))
            {
                System.out.println(c+e);
            }
            else
            {
                System.out.println(f+d);
            }
        }
    }
}
