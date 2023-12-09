import java.util.Scanner;

public class Non_Adjacent_Flips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int count=0;
            String s= sc.next();
            if(n==1 && s.charAt(0)=='1'){
                System.out.println(1);
                continue;
            }
            for(int i=0;i<n-1;i++) {
                if(s.charAt(i)=='1' && s.charAt(i+1)=='1') {
                    count=2;
                    break;
                }
                else if(s.charAt(i)=='1'|| s.charAt(i+1)=='1'){
                    count=1;
                }
            }
            System.out.println(count);
        }
    }
}
