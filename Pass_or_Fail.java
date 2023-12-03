import java.util.Scanner;

public class Pass_or_Fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int p=sc.nextInt();
            int marks=x*3;
            int ic=n-x;
            int re=marks-ic;
            if(re>=p)
            {
                System.out.println("PASS");
            }
            else
            {
                System.out.println("FAIL");
            }

        }
    }
}
