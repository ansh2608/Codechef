import java.util.Scanner;

public class Plusle_and_Minun_on_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++) arr[i]=sc.nextInt();
            long sum = 0;
            int maxOdd = Integer.MIN_VALUE,minEven = Integer.MAX_VALUE,minIndex = 0,maxIndex = 0;
            for( int i = 0 ; i < n ; i++ ){
                if( (i & 1) == 0 && Math.abs(arr[i]) < minEven ){
                    minEven = Math.abs(arr[i]);
                    minIndex = i;
                }
                else if( (i & 1) == 1 && Math.abs(arr[i]) > maxOdd ){
                    maxOdd = Math.abs(arr[i]);
                    maxIndex = i;
                }
            }
            long orSum = 0;
            for( int i = 0 ; i < n ; i++ ){
                if( (i & 1) == 0 ) orSum += Math.abs(arr[i]);
                else orSum -= Math.abs(arr[i]);
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[maxIndex];
            arr[maxIndex] = temp;
            for( int i = 0 ; i < n ; i++ ){
                if( (i & 1) == 0 ) sum += Math.abs(arr[i]);
                else sum -= Math.abs(arr[i]);
            }
            System.out.println( Math.max( orSum , sum)  );
        }
    }
}
