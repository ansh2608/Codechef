import java.util.Scanner;

public class Binary_Battles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int power=0,total=0;
            while (a!=1){
                a/=2;
                power++;
            }
            for (int i=0;i<power-1;i++) total+=b+c;
            System.out.println(total+b);
        }
    }
}
