import java.util.Scanner;

public class Chef_Eren {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (n>1){
                if (n%2==0) System.out.println(((n/2)*a)+((n/2)*b));
                else System.out.println((((n/2)+1)*b)+((n/2)*a));
            }
            else System.out.println(b);
        }
    }
}
