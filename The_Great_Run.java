import java.util.Scanner;

public class The_Great_Run {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- >0){
            int a = input.nextInt();
            int k = input.nextInt();
            int[] arr = new int[a];
            int sum = 0;
            for(int i = 0; i < a; i++){
                arr[i] = input.nextInt();
                if(i < k) sum+= arr[i];
            }
            int max = sum;
            int i =0;
            int j = k;
            while(j < a){
                sum-=arr[i];
                i++;
                sum+=arr[j];
                j++;
                if(sum > max) max = sum;
            }
            System.out.println(max);
        }
    }
}
