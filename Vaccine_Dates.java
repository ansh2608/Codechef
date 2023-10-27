import java.util.Scanner;

public class Vaccine_Dates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while (T>=0){
            int D=sc.nextInt();
            int L=sc.nextInt();
            int R=sc.nextInt();
            if (L<=D && R>=D) System.out.println("Take second dose now");
            else if(D<L) System.out.println("Too Early");
            else System.out.println("Too Late");
            T--;
        }
    }
}
