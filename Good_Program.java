import java.util.Scanner;

public class Good_Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            if (n%4==0) System.out.println("Good");
            else System.out.println("Not Good");
        }
    }
}
