import java.util.Scanner;

public class The_Two_Dishes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int N=sc.nextInt();
            int S=sc.nextInt();
            if(S<=N)
                System.out.println(S);
            else if(S>N)
                System.out.println(N-(S-N));
        }
    }
}
