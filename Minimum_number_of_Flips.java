import java.util.Scanner;

public class Minimum_number_of_Flips {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++) arr[i]=sc.nextInt();
            if (n%2!=0) System.out.println(-1);
            else {
                int d=n/2,c=0;
                for (int i:arr) if (i==-1) c++;
                System.out.println(Math.abs(d-c));
            }
        }
    }
}
