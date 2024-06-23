import java.util.Scanner;

public class Clear_Day {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner Days = new Scanner(System.in);
        int X = Days.nextInt();
        int Y = Days.nextInt();
        int totaldays = 7;
        System.out.println(totaldays - X - Y);
    }
}
