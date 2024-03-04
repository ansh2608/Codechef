import java.util.Scanner;

public class Decreasing_Srrnmieeda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int L=sc.nextInt();
            int R=sc.nextInt();
            System.out.println((R>=L*2)?-1:R);
        }
    }
}
