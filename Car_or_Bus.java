import java.util.Scanner;

public class Car_or_Bus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x<y) System.out.println("BIKE");
            else if(y<x) System.out.println("CAR");
            else System.out.println("SAME");
        }
    }
}
