import java.util.Scanner;

public class Reverse_The_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t--!=0){
            int n= sc.nextInt();
            int ans=0;
            while (n>0){
                int rem=n%10;
                ans=(10*ans)+rem;
                n/=10;
            }
            System.out.println(ans);
        }
    }
}
