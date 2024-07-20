import java.util.Scanner;

public class Battery_Health {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-- > 0){
            int x;
            x=s.nextInt();
            if(x>=80) System.out.println("YES");
            else System.out.println("no");
        }
    }
}
