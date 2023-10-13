import java.util.Scanner;

public class chocolates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T ;i++ ){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int Z=sc.nextInt();
            int ans=(5*X+10*Y)/Z;
            System.out.println(ans);
        }
    }
}
