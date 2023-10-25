import java.util.Arrays;
import java.util.Scanner;
public class Passing_Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0) {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            Arrays.sort(arr);
            if(n==x)
            {
                int min=arr[0];
                for(int i=0;i<n;i++) {
                    if(min>arr[i])
                        min=arr[i];
                }
                System.out.println(min-1);
            }
            else System.out.println(arr[n-x]-1);
            t--;
        }
    }
}
