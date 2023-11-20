import java.util.Scanner;

public class Self_Defence_Training {
    public static void main(String[] args) {
        int count = 0 ;
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0) {
            int N = sc.nextInt();
            while(N--!=0) {
                int A = sc.nextInt();
                if (A>=10 && A<=60) count++;
            }
            System.out.println(count);
            count =  0;
        }
    }
}
