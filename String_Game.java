import java.util.Arrays;
import java.util.Scanner;

public class String_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            int c=0,k=0,l=0;
            int a[]=new int[n];
            for(int j=0;j<n;j++) a[j]=s.charAt(j)-'0';
            Arrays.sort(a);
            for(int j=0;j<n;j++) {
                if(a[j]==1) {
                    l=j;
                    break;
                }
            }
            int pos=l;
            while(k<pos&&l<n) {
                if(a[k]!=a[l]) {
                    c++;
                    k++;
                    l++;
                }
            }
            if(c%2==0) System.out.println("Ramos");
            else System.out.println("Zlatan");
        }
    }
}
