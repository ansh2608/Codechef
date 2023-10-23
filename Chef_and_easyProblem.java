import java.util.Arrays;
import java.util.Scanner;

public class Chef_and_easyProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++){
            int N=sc.nextInt();
            int[] arr=new int[N];
            for (int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            long sum = 0;
            for( int j=N-1;j>=0;j-=2){
                sum += arr[j];
            }
            System.out.println( sum );
        }
    }
}
