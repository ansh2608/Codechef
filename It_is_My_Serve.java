import java.util.Scanner;

public class It_is_My_Serve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int p=sc.nextInt();
            int q=sc.nextInt();
            int serve=p+q;
            if (serve%4==0 || serve%4==1) System.out.println("Alice");
            else System.out.println("Bob");
        }
    }
}
