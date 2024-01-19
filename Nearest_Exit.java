import java.util.Scanner;

public class Nearest_Exit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int x=sc.nextInt();
            if (x>=1 && x<=50) System.out.println("LEFT");
            else System.out.println("RIGHT");
        }
    }
}
