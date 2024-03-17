import java.util.Scanner;

public class Counting_Flags {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long fact=0;
            fact+=n*(n-1)*(n-1);
            fact+=n*(n-1)*(n-1);
            fact+=n*(n-1)*(n-2);
            fact+=2*n*(n-1)*(n-2)*(n-2);
            System.out.println(fact);
        }
    }
}
