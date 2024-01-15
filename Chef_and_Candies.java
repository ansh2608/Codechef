import java.util.Scanner;

public class Chef_and_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>=b){
                if((a-b)%4==0) System.out.println((a-b)/4);
                else System.out.println((a-b)/4+1);
            }
            else System.out.println("0");
        }
    }
}
