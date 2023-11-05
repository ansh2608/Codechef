import java.util.Scanner;

public class Weight_Balance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int w1=sc.nextInt();
            int w2=sc.nextInt();
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int m=sc.nextInt();
            int w=w2-w1;
            int min=x1*m;
            int max=x2*m;
            if (w<min || w>max) System.out.println(0);
            else System.out.println(1);
        }
    }
}
