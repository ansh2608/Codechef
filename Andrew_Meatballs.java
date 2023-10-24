import java.util.Arrays;
import java.util.Scanner;

public class Andrew_Meatballs {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++){
            int N=sc.nextInt();
            long M=sc.nextLong();
            long[] arr=new long[N];
            for(int j=0;j<N;j++){
                arr[j]=sc.nextLong();
            }
            Arrays.sort(arr);
            long s=0;
            int flag=1;
            for(int j=N-1;j>=0;j--){
                s+=arr[j];
                if(s>=M){
                    flag=0;
                    System.out.println(N-j);
                    break;
                }
            }
            if(flag==1) System.out.println(-1);
        }
    }
}
