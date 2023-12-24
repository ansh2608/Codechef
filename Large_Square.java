import java.util.Scanner;

public class Large_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int a= sc.nextInt();
            int s = (int)Math.sqrt(n);
            System.out.println(s*a);
        }
    }
}
