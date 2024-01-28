import java.util.Scanner;

public class Mario_and_Bullet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int d=y/x;
            if (z>d) System.out.println(z-d);
            else System.out.println(0);
        }
    }
}
