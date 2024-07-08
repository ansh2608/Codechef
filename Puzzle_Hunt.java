import java.util.Scanner;

public class Puzzle_Hunt {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>=6 && x<=8) System.out.println("yes");
        else System.out.println("no");
    }
}
