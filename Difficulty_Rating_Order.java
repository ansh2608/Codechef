import java.util.Scanner;
public class Difficulty_Rating_Order {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++) {
            boolean flag = false;
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 1; j < N; j++) {
                if (arr[j] < arr[j - 1]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
