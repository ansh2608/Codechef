import java.util.Scanner;

public class Degree_of_Polynomial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int max=0;
            for (int i=0;i<n ;i++ ){
                arr[i]=sc.nextInt();
                if(arr[i]!=0) max=i;
            }
            System.out.println(max);
        }
    }
}
