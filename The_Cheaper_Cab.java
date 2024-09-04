import java.util.Scanner;

public class The_Cheaper_Cab {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            int a=obj.nextInt();
            int b=obj.nextInt();
            if(a==b) System.out.println("ANY");
            else if(a<b) System.out.println("FIRST");
            else System.out.println("SECOND");
        }
    }
}
