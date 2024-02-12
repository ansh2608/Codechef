import java.util.Scanner;

public class Building_Race {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            float a=sc.nextInt();
            float b=sc.nextInt();
            float c=sc.nextInt();
            float d=sc.nextInt();
            float chef=a/c;
            float chefina=b/d;
            if(chef<chefina) System.out.println("chef");
            else if(chef>chefina) System.out.println("chefina");
            else if(chef==chefina) System.out.println("both");
        }
    }
}
