import java.util.Scanner;

public class Airlines {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int x=sc.nextInt();
            int n=sc.nextInt();
            int planesNeeded = (n + 99) / 100;
            int additionalPlanes = planesNeeded - x;
            System.out.println(Math.max(0, additionalPlanes));
        }
    }
}
