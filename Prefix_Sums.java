import java.util.*;

public class Prefix_Sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int[] arr1=new int[N];
            ArrayList<Integer> arrList2 = new ArrayList<>();
            ArrayList<Integer> arrList3 = new ArrayList<>();
            int sum1 = 0;
            int sum2 = 0;
            if(N==2 || N==0 || N%2!=0){
                System.out.println("NO");
            }else{
                for(int i=0;i<N;i++){
                    arr1[i]=i+1;
                }
                for(int i=0;i<N/2;i++){
                    if(i%2==0){
                        sum1=sum1+arr1[i];
                        arrList2.add(arr1[i]);
                    }else{
                        sum2=sum2+arr1[i];
                        arrList3.add(arr1[i]);
                    }
                }
                for(int i=N/2;i<arr1.length;i++){
                    if(i%2==0){
                        sum2=sum2+arr1[i];
                        arrList3.add(arr1[i]);
                    }else{
                        sum1=sum1+arr1[i];
                        arrList2.add(arr1[i]);
                    }
                }
                if(sum1==sum2){
                    System.out.println("YES");
                    for(int i=0;i<arrList2.size();i++){
                        System.out.print(arrList2.get(i)+" ");
                    }
                    System.out.println();
                    for(int i=0;i<arrList3.size();i++){
                        System.out.print(arrList3.get(i)+" ");
                    }
                    System.out.println();
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
