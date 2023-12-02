import java.util.Scanner;

public class AorB {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=500-b*2;
            int g=1000-(c*4);
            int e=1000-((b+c)*4);
            int h=500-((b+c)*2);
            int x=d+e;
            int j=g+h;
            System.out.println(Math.max(x,j));
        }
    }
}
