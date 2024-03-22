import java.util.Scanner;

public class Magical_Planks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            String modified = "";
            int count = 0;
            if(n==1){
                System.out.println(0);
                continue;
            }
            while(count < n-1){
                while(count<n-1 && s.charAt(count) == s.charAt(count+1)) count++;
                modified += s.charAt(count);
                count++;
            }
            if(s.charAt(n-1) != s.charAt(n-2)) modified +=s.charAt(n-1);
            int wc = 0, bc = 0;
            n = modified.length();
            for(int i=0; i<n; i++){
                if(modified.charAt(i) == 'W') wc++;
                else bc++;
            }
            System.out.println((n==wc || n==bc) ? 0: Math.min(bc,wc));
        }
    }
}
