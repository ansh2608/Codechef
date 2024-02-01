import java.util.Scanner;

public class Fill_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int m=sc.nextInt();
            int mul=k*m;
            if (n%mul==0) System.out.println(n/mul);
            else System.out.println((n/mul)+1);
        }
    }
}
