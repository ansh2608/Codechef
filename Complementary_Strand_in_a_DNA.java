import java.util.Scanner;

public class Complementary_Strand_in_a_DNA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            String s=sc.next();
            String str="";
            for (int i=0;i<n;i++){
                char ch=s.charAt(i);
                if (ch=='A') str+='T';
                else if (ch=='T') str+='A';
                else if (ch=='C') str+='G';
                else if (ch=='G') str+='C';
            }
            System.out.println(str);
        }
    }
}
