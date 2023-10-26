import java.util.Scanner;

public class Richie_Rich {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int X=sc.nextInt();
            int ans=(B-A)/X;
            System.out.println(ans);
            t--;
        }
    }
}
