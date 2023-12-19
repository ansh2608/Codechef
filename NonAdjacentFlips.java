import java.util.Scanner;
public class NonAdjacentFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            String s = sc.next();
            if(s.contains("11")) System.out.println(2);
            else if(s.contains("1")) System.out.println(1);
            else System.out.println(0);
        }
    }
}
