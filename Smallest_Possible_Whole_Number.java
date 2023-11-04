import java.util.Scanner;

public class Smallest_Possible_Whole_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if (k==0) System.out.println(n);
            else System.out.println(n%k);
        }
    }
}
