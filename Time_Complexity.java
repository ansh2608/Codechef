import java.util.Scanner;

public class Time_Complexity {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        while(n-- >0){
            int a = s.nextInt();
            int b = s.nextInt();
            if(a>b) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
