import java.util.Scanner;

public class Dracula_Eats {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int i=2;
            int x=0;
            if(n==1) System.out.println(0);
            else{
                while(i<=n ){
                    x=x+1;
                    i=i+7;
                }
                System.out.println(x);
            }
        }
    }
}
