import java.util.Scanner;

public class Two_Dishes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++){
            int N=sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            int C=sc.nextInt();
            int count =0;
            while (B-->0){
                if(A>0){
                    count++;
                    A--;
                }
                else if(C>0){
                    count++;
                    C--;
                }
            }
            if(count>=N) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
