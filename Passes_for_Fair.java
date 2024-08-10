import java.util.Scanner;

public class Passes_for_Fair {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0) {
            int friends = sc.nextInt();
            int passes =  sc.nextInt();
            String canEnterWithAllFriends;
            canEnterWithAllFriends = passes>=(1+friends)? "YES":"NO";
            System.out.println(canEnterWithAllFriends);
        }//while

    }
}
