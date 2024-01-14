import java.util.Scanner;

public class Sugarcane_Juice_Business {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int b=n*50;
            System.out.println((int)(b*0.3));
        }
    }
}
