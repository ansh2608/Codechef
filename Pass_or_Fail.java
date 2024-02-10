import java.util.Scanner;

public class Pass_or_Fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int p=sc.nextInt();
            int numbers=3*x-(n-x);
            if (numbers>=p) System.out.println("PASS");
            else System.out.println("FAIL");
        }
    }
}
