import java.util.Scanner;

public class Presents_for_Cheffina {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            if(n%5==0) {
                int free =n/5;
                System.out.println(n-free);
            }
            else {
                int free= n/5;
                System.out.println(n-free);
            }
        }
    }
}
