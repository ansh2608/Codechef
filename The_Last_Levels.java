import java.util.Scanner;

public class The_Last_Levels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if (x%3!=0) System.out.println(x*y + ((x/3)*z));
            else if (x%3==0) System.out.println(x*y + (((x/3)-1)*z));
            else System.out.println(x*y);
        }
    }
}
