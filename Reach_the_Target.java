import java.util.Scanner;

public class Reach_the_Target {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        while(n>0){
            int a=s.nextInt();
            int b= s.nextInt();
            System.out.println(a-b);
            n--;
        }
    }
}
