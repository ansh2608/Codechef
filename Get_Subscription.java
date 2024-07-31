import java.util.Scanner;

public class Get_Subscription {
    public static String subOrNot(int minutes) {
        if(minutes <= 30) return "No";
        else return "Yes";
    }
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i<t; i++) {
            int minutes = scan.nextInt();
            System.out.println(subOrNot(minutes));
        }
    }
}
