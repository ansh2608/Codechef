import java.util.Scanner;
public class Seven_Rings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++){
            int N=sc.nextInt();
            int X=sc.nextInt();
            int Y=N*X;
            if (Y>=10000 && Y<=99999){
                System.out.println("Yes");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
