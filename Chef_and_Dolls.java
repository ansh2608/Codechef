import java.util.Scanner;

public class Chef_and_Dolls {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cases = scn.nextInt();
        while(cases-- > 0) {
            int num_dolls = scn.nextInt();
            int type = 0;
            for(int i = 0; i < num_dolls; ++i) type ^= scn.nextInt();
            System.out.println(type);
        }
    }
}
