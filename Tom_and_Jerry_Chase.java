import java.util.Scanner;

public class Tom_and_Jerry_Chase {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x<y) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
