import java.util.Scanner;

public class Test_Score {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            String ans="NO";
            for (int i=1;i<=n;i++) if (x*i==y) ans="YES";
            if (y==0 && n>0) System.out.println("YES");
            else System.out.println(ans);
        }
    }
}
