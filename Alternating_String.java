import java.util.Scanner;

public class Alternating_String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            String str=s.next();
            int x=0,y=0;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='0')
                    x++;
                else
                    y++;
            }
            if(x==n || y==n) System.out.println(1);
            else if(y>x) System.out.println(2*x+1);
            else if(x>y) System.out.println(2*y+1);
            else if(x==y) System.out.println(2*(x));
        }
    }
}
