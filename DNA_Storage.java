import java.util.Scanner;

public class DNA_Storage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            String s=sc.next();
            for (int j=0;j<n;j+=2){
                if (s.charAt(j)=='0' && s.charAt(j+1)=='0') System.out.print("A");
                else if (s.charAt(j)=='0' && s.charAt(j+1)=='1') System.out.print("T");
                else if (s.charAt(j)=='1' && s.charAt(j+1)=='0') System.out.print("C");
                else if (s.charAt(j)=='1' && s.charAt(j+1)=='1') System.out.print("G");
            }
            System.out.println();
        }
    }
}
