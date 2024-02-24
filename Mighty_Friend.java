import java.util.*;

public class Mighty_Friend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0 ) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            PriorityQueue<Integer> to = new PriorityQueue<>();
            PriorityQueue<Integer> mo = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                if ((i & 1) == 0) mo.add(a[i]);
                else to.add(a[i]);
            }
            while (k > 0) {
                if (!to.isEmpty() && !mo.isEmpty() && to.peek() < mo.peek()) {
                    int temp = to.remove();
                    int temp1 = mo.remove();
                    to.add(temp1);
                    mo.add(temp);
                } else {
                    break;
                }
                k--;
            }
            long tSum = 0;
            long mSum = 0;
            while (!to.isEmpty()) tSum += to.remove();
            while (!mo.isEmpty()) mSum += mo.remove();
            if (mSum < tSum) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
