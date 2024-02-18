import java.util.Scanner;

public class Get_Lowest_Free {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int x = sc.nextInt();
            int y  =sc.nextInt();
            int z = sc.nextInt();
            int k = Math.min(x, Math.min(y, z));
            System.out.println(x+y+z-k);
        }
    }
}
