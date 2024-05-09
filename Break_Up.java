import java.util.Scanner;

public class Break_Up {
    public static boolean checkPalindrome(int[] seq, int start, int end){
        while(start < end){
            if(seq[start] != seq[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static int minPalSeq(int N, int[] sequence) {
        int[] dp=new int[N+1];
        for(int i=0;i<=N;i++)
            dp[i]=Integer.MAX_VALUE;
        dp[0]=0;

        for(int i=1;i<=N;i++){
            for(int j=0;j<i;j++){
                if(checkPalindrome(sequence, j, i - 1)){
                    dp[i]=Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[N];
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] sequence=new int[N];
        for(int i=0;i<N;i++){
            sequence[i]=sc.nextInt();
        }

        int result=minPalSeq(N, sequence);
        System.out.println(result);
    }
}
