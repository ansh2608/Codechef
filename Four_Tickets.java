import java.util.Scanner;

public class Four_Tickets {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a;
            a=sc.nextInt();
            if(4*a<=1000) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
