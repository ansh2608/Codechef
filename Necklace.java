import java.util.*;

public class Necklace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Queue<Integer> q=new LinkedList<>();
            for (int i=0;i<n;i++) q.add(sc.nextInt());
            for (int i=0;i<k;i++) q.add(q.remove());
            int[] ans=new int[n];
            for (int i=0;i<n;i++) ans[i]=q.remove();
            for (int i:ans) System.out.print(i+" ");
            System.out.println();
        }
    }
}
