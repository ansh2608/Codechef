import java.util.Scanner;

public class True_and_False_Paper {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int m=sc.nextInt();
            int n=sc.nextInt();
            System.out.println(m-n);
        }
    }
}
