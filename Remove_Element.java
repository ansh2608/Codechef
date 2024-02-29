import java.util.Arrays;
import java.util.Scanner;

public class Remove_Element {
    public static void help(int[] arr,int k){
        if (arr.length==1) {
            System.out.println("Yes");
            return;
        }
        if ((arr[0]+arr[arr.length-1])>k){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++) arr[i]=sc.nextInt();
            Arrays.sort(arr);
            help(arr,k);
        }
    }
}
