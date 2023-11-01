import java.util.Scanner;

public class Problem_Category {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int x=sc.nextInt();
            if (x>=1 && x<100) System.out.println("Easy");
            else if (x>=100 && x<200) System.out.println("Medium");
            else System.out.println("Hard");
        }
    }
}
