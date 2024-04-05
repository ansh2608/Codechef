import java.util.Scanner;

public class CAO_Stage_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            String[] str = new String[r];
            for (int i = 0; i < r; i++) str[i] = sc.next();
            int ans = 0;
            for (int i = 2; i < r - 2; i++) {
                for (int j = 2; j < c - 2; j++) {
                    boolean l = false, ri = false, to = false, d = false;
                    if (str[i].charAt(j) == '^') {
                        if (str[i].charAt(j - 1) == '^' && str[i].charAt(j - 2) == '^') l = true;
                        if (str[i].charAt(j + 1) == '^' && str[i].charAt(j + 2) == '^') ri = true;
                        if (str[i - 1].charAt(j) == '^' && str[i - 2].charAt(j) == '^') to = true;
                        if (str[i + 1].charAt(j) == '^' && str[i + 2].charAt(j) == '^') d = true;
                    }
                    if (l && ri && to && d) ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
