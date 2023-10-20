import java.sql.SQLOutput;
import java.util.Scanner;

public class Rearrange_code {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int t=kb.nextInt();
        while(t-->0){
            int n=kb.nextInt();

            int []arr=new int[n];
            int maxOm=-1,count=0;
            for(int i=0;i<arr.length;i++){
                arr[i]=kb.nextInt();
                if(arr[i]==0){
                    if(maxOm<count){
                        maxOm=count;
                    }
                    count=0;
                }
                else
                    count++;
            }
            if(maxOm<count)
                maxOm=count;

            int [] brr=new int[n];
            int maxAddy=-1;
            count=0;
            for(int i=0;i<brr.length;i++){
                brr[i]=kb.nextInt();
                if(brr[i]==0){
                    if(maxAddy<count)
                        maxAddy=count;
                    count=0;
                }
                else
                    count++;
            }
            if(maxAddy<count)
                maxAddy=count;

            if(maxAddy==maxOm)
                System.out.println("Draw");
            else
                System.out.println(maxAddy>maxOm?"Addy":"Om");
            
        }
    }
}
