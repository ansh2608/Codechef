import java.util.*;

public class Stone_Pile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            Queue<Integer> q=new LinkedList<>();
            for (int i=0;i<n;i++) q.add(sc.nextInt());
            int player=0;
            while (q.size()>1){
                if (player==0){
                    q.add(q.remove());
                    q.remove();
                }
                else {
                    q.add(q.remove());
                    q.add(q.remove());
                    q.remove();
                }
                player=1-player;
            }
            System.out.println(player+" "+q.peek());
        }
    }
}
