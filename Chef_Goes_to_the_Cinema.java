import java.util.Scanner;

public class Chef_Goes_to_the_Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0){
            long n = sc.nextLong();
            long time = 0, i =1,prev=1;
            while(true){
                long ans = i*(i+1)/2;
                if(ans>=n){
                    long diff = ans-n;
                    long diff2 = n-prev;
                    if(diff<diff2) time+=i+diff;
                    else time+= i+diff2-1;
                    break;
                }
                prev = ans;
                i++;
            }
            if(n==1) System.out.println(1);
            else System.out.println(time);
        }
    }
}
