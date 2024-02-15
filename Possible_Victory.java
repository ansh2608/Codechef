import java.util.Scanner;

public class Possible_Victory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int o=sc.nextInt();
        int c=sc.nextInt();
        if(c + (20-o)*36>r) System.out.println("YES");
        else System.out.println("NO");
    }
}
