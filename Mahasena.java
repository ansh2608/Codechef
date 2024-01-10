import java.util.Scanner;

public class Mahasena {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) arr[i]=sc.nextInt();
        int count_odd=0,count_even=0;
        for (int i=0;i<n;i++){
            if (arr[i]%2==0) count_even++;
            else count_odd++;
        }
        if (count_even>count_odd) System.out.println("READY FOR BATTLE");
        else System.out.println("NOT READY");
    }
}
