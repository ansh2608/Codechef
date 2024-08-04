import java.util.Scanner;

public class Just_One_More_Episode {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int x=sc.nextInt();
            if(x>24) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
