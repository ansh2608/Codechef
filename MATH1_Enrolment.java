import java.util.Scanner;

public class MATH1_Enrolment {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            if(Y>X){
                System.out.println(Y-X);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
