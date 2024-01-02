import java.util.Scanner;

public class Make_it_Divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            if(n==1) System.out.println(3);
            else {
                for(int i=1; i<n; i++) System.out.print(9);
                System.out.print(3);
                System.out.println();
            }
        }
    }
}
