import java.math.BigInteger;
import java.util.*;

public class Add_One {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            BigInteger b=new BigInteger(s);
            BigInteger e=new BigInteger("1");
            BigInteger r=b.add(e);
            System.out.println(r);
        }
    }
}
