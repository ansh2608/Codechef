import java.util.Arrays;
import java.util.Scanner;


public class Racing_Horses {

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
            int min=Integer.MAX_VALUE;
            for (int j=1;j<N;j++){
                min=Math.min(min,arr[j]-arr[j-1]);
            }
            System.out.println(min);
        }
    }
}
