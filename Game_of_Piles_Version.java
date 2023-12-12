import java.util.Scanner;

public class Game_of_Piles_Version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []arr=new int[n];
            boolean flag=false;
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
                if(arr[i]==1){
                    flag=true;
                }
            }
            if(flag) System.out.println("CHEF");
            else{
                if((sum-2*n)%2==0) System.out.println("CHEFINA");
                else System.out.println("CHEF");
            }
        }
    }
}
