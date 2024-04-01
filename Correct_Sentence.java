import java.util.Scanner;

public class Correct_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases-->0){
            int n = sc.nextInt();
            String line = sc.nextLine();
            boolean flag = true;
            String arr[] = line.split("\\s+");
            for (int i = 1; i <=n; i++) {
                String word = arr[i];
                char ch =word.charAt(0);
                if(ch>='a'&&ch<='m') flag = smallStringCheck(word);
                else flag = capitalStringCheck(word);
                if(!flag) break;
            }
            System.out.println(flag? "YES":"NO");
        }
    }
    static boolean smallStringCheck(String word){
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if(!(ch>='a'&& ch<='m')) return false;
        }
        return true;
    }
    static boolean capitalStringCheck(String word){
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if(!(ch>='N'&& ch<='Z')) return false;
        }
        return true;
    }
}
