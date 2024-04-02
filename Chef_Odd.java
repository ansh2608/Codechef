import java.util.Scanner;

public class Chef_Odd {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt(),i;
        String ans;
        while(T--!=0){
            long N = sc.nextLong();
            long K = sc.nextLong();
            long o;
            ans="NO";
            if(K > N/2) System.out.println("NO");
            else{
                if(N%2 == 0) o=N/2;
                else o=(N+1)/2;
                long remaining = K-o;
                if(remaining%2 == 0) ans="YES";
                System.out.println(ans);
            }
        }
    }
}
