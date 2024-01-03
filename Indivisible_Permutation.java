import java.util.*;
public class Indivisible_Permutation {
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        while(T-->0){
            int n=input.nextInt();
            for(int i=2;i<=n;i++)
                System.out.print(i+" ");
            System.out.println("1");
        }
    }
}
