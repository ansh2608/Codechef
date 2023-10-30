import java.util.Scanner;

public class Motivation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int rating=0;
            int N=sc.nextInt();
            int X=sc.nextInt();
            for (int j=0;j<N;j++){
                int S=sc.nextInt();
                int R=sc.nextInt();
                if (S <= X && R > rating){
                    rating=R;
                }
            }
            System.out.println(rating);
        }
    }
}
