import java.util.Scanner;

public class Sort_the_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            int c=0;
            for (int i=0;i<n-1;i++) if (s.charAt(i)=='1' && s.charAt(i+1)=='0') c++;
            System.out.println(c);
        }
    }
}
