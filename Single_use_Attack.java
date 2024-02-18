import java.util.Scanner;

public class Single_use_Attack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while (T--!=0){
            int H = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(H-Y<=0) System.out.println("1");
            else {
                int specialattackcombo= (int)(Math.ceil((double)(H-Y)/X))+1;
                System.out.println(specialattackcombo);
            }
        }
    }
}
