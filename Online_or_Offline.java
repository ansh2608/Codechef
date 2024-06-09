import java.util.Scanner;

public class Online_or_Offline {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            double z= N - N*0.1;
            if(z < M ){
                System.out.println("ONLINE");
            }
            else if(z == M){
                System.out.println("EITHER");
            }
            else if(z>M){
                System.out.println("DINING");
            }
        }
    }
}
