import java.util.Scanner;

public class Reach_on_Time {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        while(n-->0){
            int x =in.nextInt();
            String p=(x>=30)?"yes":"No";
            System.out.println(p);
        }
    }
}
