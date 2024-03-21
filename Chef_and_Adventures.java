import java.util.Scanner;

public class Chef_and_Adventures {
    static final long MOD = 1000000007;
    static final long INF = 10000000000000000L;

    static void solve(int test, Scanner sc){
        int n, m, x, y;
        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        n--; m--;

        if(n>=0 && m>=0 && (n%x)==0 && (m%y)==0) {
            System.out.println("Chefirnemo");
        }
        else if(n-1>=0 && m-1>=0 && (n-1)%x==0 && (m-1)%y==0){
            System.out.println("Chefirnemo");
        }
        else System.out.println("Pofik");
    }

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(t, sc);
        }
    }
}
