import java.util.Scanner;

public class Expert_Setter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            double approvalPercentage = (double) Y / X * 100;
            if (approvalPercentage >= 50) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
