import java.util.Scanner;

public class Reach_Home {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = n*5;
            if(y>=x) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
