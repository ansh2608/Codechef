import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c= sc.nextInt();
            if (a>=b && a>=c) System.out.println(Math.min(a,Math.max(b,c)));
            else if (b>=a && b>=c) System.out.println(Math.min(b,Math.max(a,c)));
            else if (c>=a && c>=b) System.out.println(Math.min(c,Math.max(a,b)));
        }
    }
}
