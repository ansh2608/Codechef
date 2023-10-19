import java.util.Arrays;
import java.util.Scanner;

public class Largest_and_secondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++){
            int N=sc.nextInt();
            int[] Arr=new int[N];
            for (int j=0;j<N;j++){
                Arr[j]= sc.nextInt();
            }
            Arrays.sort(Arr);
            for(int K = N -1;K>=0;){
                if(Arr[K] != Arr[K-1] ){
                    System.out.println(Arr[K] +Arr[K-1]);
                    break;
                }
                else{
                    K--;
                }
            }
        }
    }
}
