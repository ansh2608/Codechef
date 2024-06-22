import java.util.Scanner;

public class Lucky_Seven {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int index = 6;
        char luckyLetter = s.charAt(index);
        System.out.println(luckyLetter);
    }
}
