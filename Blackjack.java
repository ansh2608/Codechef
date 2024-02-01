import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int d=0;
            for (int i=1;i<=10;i++){
                d=a+b+i;
                if (d==21) {
                    System.out.println(i);
                    break;
                }
            }
            if (d!=21) System.out.println(-1);
        }
    }
}
