import java.util.Scanner;

public class Distinct_Pair_Sums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            if (l==r) System.out.println(1);
            else System.out.println(2*r-2*l+1);
        }
    }
}
