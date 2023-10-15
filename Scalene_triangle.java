import java.util.Scanner;
public class Scalene_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a!=b && b!=c && c!=a){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
