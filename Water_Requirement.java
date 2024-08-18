import java.util.Scanner;

public class Water_Requirement {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int hours = sc.nextInt();
            int requiredLitres = hours*2;
            System.out.println(requiredLitres);
        }//while
    }
}
