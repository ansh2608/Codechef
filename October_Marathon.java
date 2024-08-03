import java.util.Scanner;

public class October_Marathon {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        String medal = getMedal(hours);
        System.out.println(medal);
    }
    public static String getMedal(int hours) {
        if (hours < 3) return "GOLD";
        else if (hours < 6) return "SILVER";
        else return "BRONZE";
    }
}
