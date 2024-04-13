import java.util.Arrays;
import java.util.Scanner;

public class Devu_and_friendship_testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase-- > 0){
            int a = sc.nextInt();
            int count=0;
            int[] arr = new int[a];
            for(int i=0;i<a;i++) arr[i]=sc.nextInt();
            Arrays.sort(arr);
            for(int i=0;i<a-1;i++) if(arr[i]!=arr[i+1]) count++;
            System.out.println(count+1);
        }
    }
}
