import java.util.Scanner;

public class Sasta_Shark_Tank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int aVal=a*10;
            int bVal=b*5;
            if (aVal==bVal) System.out.println("Any");
            else if (aVal>bVal) System.out.println("First");
            else System.out.println("Second");
        }
    }
}
