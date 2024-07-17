import java.util.Scanner;

public class Parity {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner Choco = new Scanner(System.in);
        int T = Choco.nextInt();
        while(T --> 0){
            int N = Choco.nextInt();
            int M = N % 2;
            if(M == 0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
