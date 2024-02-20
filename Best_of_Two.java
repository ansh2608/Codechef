import java.util.Scanner;

public class Best_of_Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int a3=sc.nextInt();
            int b1=sc.nextInt();
            int b2=sc.nextInt();
            int b3=sc.nextInt();
            int a = Math.min(a1, Math.min(a2, a3));
            int b = Math.min(b1, Math.min(b2, b3));
            int x = a1 + a2 + a3 - a;
            int y = b1 + b2 + b3 - b;
            if(x>y) System.out.println("Alice");
            else if(x<y) System.out.println("Bob");
            else System.out.println("Tie");
        }
    }
}
