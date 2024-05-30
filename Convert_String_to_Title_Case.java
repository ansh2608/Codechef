import java.util.Scanner;

public class Convert_String_to_Title_Case {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        while (T-->0){
            String S = scanner.nextLine();
            StringBuilder result = new StringBuilder();
            String[] words = S.split(" ");
            for(String word : words) result.append(formatWord(word)).append(" ");
            System.out.println(result.toString().trim());
        }
    }
    static String formatWord(String word){
        if(word.equals(word.toUpperCase())) return word;
        else return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
    }
}
