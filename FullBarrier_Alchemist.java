import java.util.Scanner;

public class FullBarrier_Alchemist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0){
            int N = sc.nextInt();
            int H = sc.nextInt();
            int Y1 = sc.nextInt();
            int Y2 = sc.nextInt();
            int L = sc.nextInt();
            int[][] arr = new int[N][2];
            for (int i = 0; i < N; i++) for (int j = 0; j < 2; j++) arr[i][j] = sc.nextInt();
            int count=0;
            for (int i = 0; i < N; i++) {
                if (arr[i][0] == 1) {
                    if(arr[i][1]>=(H-Y1)) count++;
                    else if(L>1) {
                        count++;
                        L--;
                    }
                    else if(L==1) break;
                } else {
                    if(Y2>=arr[i][1]) count++;
                    else if(L>1) {
                        count++;
                        L--;
                    }
                    else if(L==1) break;
                }
            }
            System.out.println(count);
        }
    }
}
