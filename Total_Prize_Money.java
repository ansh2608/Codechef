import java.util.Scanner;

public class Total_Prize_Money {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int x = s.nextInt();
            int y = s.nextInt();
            System.out.println((10*x) + (y*90));
        }
    }
}
