import java.util.Scanner;

public class Chef_and_the_Wildcard_Matching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t--!=0){
            String X = sc.nextLine();
            String Y = sc.nextLine();
            boolean canMatch = true;
            for(int i=0; i<X.length(); i++){
                if(X.charAt(i)=='?' || Y.charAt(i)=='?') continue;
                if(X.charAt(i) == Y.charAt(i)) continue;
                if(X.charAt(i) !=  Y.charAt(i)) {
                    canMatch = false;
                    break;
                }
            }
            if(canMatch) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
