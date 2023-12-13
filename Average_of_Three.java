import java.util.Scanner;

public class Average_of_Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int x=sc.nextInt();
            System.out.println("1 2 "+((x*3)-3));
        }
    }
}
