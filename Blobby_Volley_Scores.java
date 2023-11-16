import java.util.Scanner;

public class Blobby_Volley_Scores {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            String s=sc.next();
            int server=0;
            int receiver=0;
            if (s.charAt(0)=='A') server++;
            else receiver=0;
            for (int j=1;j<n;j++){
                if (s.charAt(j)=='A'){
                    if (s.charAt(j-1)=='A') server++;
                }
                else {
                    if (s.charAt(j-1)=='B') receiver++;
                }
            }
            System.out.println(server+" "+receiver);
        }
    }
}
