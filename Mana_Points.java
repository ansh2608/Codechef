import java.util.Scanner;

public class Mana_Points {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println((int)(y/x));
        }
    }
}
