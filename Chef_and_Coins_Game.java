import java.util.Scanner;

public class Chef_and_Coins_Game {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int t=0;t<T;t++) {
            int n = s.nextInt();
            if (n%6==0) System.out.println("Misha");
            else System.out.println("Chef");
        }
    }
}
