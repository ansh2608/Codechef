import java.util.Scanner;

public class Recent_contest_problems {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0) {
            int N=scan.nextInt();
            int S1=0, S2=0;
            while(N-->0) {
                String M=scan.next();
                if(M.equals("START38")) S1++;
                else S2++;
            }
            System.out.println(S1+" "+S2);
        }
    }
}
