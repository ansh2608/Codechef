import java.util.Scanner;

public class Primality_Test {
    public static void seive(){

        for(int i=2;i<=N;i++) arr[i] = true;
        for(int i=2;i*i<=N;i++){
            if(arr[i]){
                for(int j=i*i;j<=N;j=j+i) arr[j] = false;
            }
        }

    }
    static int N = 100000;
    static boolean[] arr = new boolean[N+1];
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        seive();
        while(T-->0){
            int N = sc.nextInt();
            if(arr[N])System.out.println("yes");
            else System.out.println("no");
        }
    }
}
