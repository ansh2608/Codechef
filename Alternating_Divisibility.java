import java.util.*;

public class Alternating_Divisibility {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int num = 1;
            int count = 1;
            HashSet<Integer> hs = new HashSet<>();
            hs.add(num);
            System.out.print(num + " ");
            for(int i=1; i<n; i++) {
                if(i % 2 == 0) {
                    num = count;
                    while(hs.contains(num)) num++;
                    System.out.print(num + " ");
                    hs.add(num);
                    count = num;
                }
                else {
                    System.out.print(num*2 + " ");
                    num *= 2;
                    hs.add(num);
                }
            }
            System.out.println();
        }
    }
}
