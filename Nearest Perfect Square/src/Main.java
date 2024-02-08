public class Main {
    public static int[] nearestPerfectSquare(int N) {
        double val=Math.sqrt(N);
        int value=(int)val;
        int[] ans=new int[2];
        if (value==val) ans[0]=N;
        else if(val>value) {
            int extra=value+1;
            int one=value*value;
            int two=extra*extra;
            if(Math.abs(N-one)<Math.abs(N-two)) {
                ans[0]=one;
                ans[1]=Math.abs(N-one);
            }
            else {
                ans[0]=two;
                ans[1]=Math.abs(N-two);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=1500;
        int[] ans=nearestPerfectSquare(n);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}