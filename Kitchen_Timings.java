import java.util.Scanner;

public class Kitchen_Timings {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            System.out.println(n2-n1);
        }
    }
}
