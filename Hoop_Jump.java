import java.util.Scanner;

public class Hoop_Jump {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++){
            int N=sc.nextInt();
            if (N==1) System.out.println("1");
            else {
                if (N%2==0) System.out.println((N/2)+1);
                else System.out.println((N+1)/2);
            }
        }
    }
}
