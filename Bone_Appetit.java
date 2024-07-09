import java.util.Scanner;

public class Bone_Appetit {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int m = scn.nextInt();
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println((n*x)+(m*y));
    }
}
