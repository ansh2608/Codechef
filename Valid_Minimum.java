import java.util.*;
public class Valid_Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int[] a = new int[3];
            a[0] =sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            Arrays.sort(a);
            System.out.println(a[0]==a[1]?"YES":"NO");
        }
    }
}
