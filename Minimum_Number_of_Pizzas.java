import java.util.*;
public class Minimum_Number_of_Pizzas {
    static int gcd(int num1, int num2){
        if(num2 == 0)
            return num1;
        else{
            return gcd(num2, num1%num2);
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int pizza = n /gcd(n,k);
            System.out.println(pizza);
        }
    }
}
