public class Optimal_Approach {
    static int checkPerfectSquare(int N){
        if(N<0) return 0;
        if(N==0 || N==1) return 1;
        int left = 1,right = N;
        int mid= left+(right-left)/2;
        while(left<=right)
        {
            int sq = mid*mid;
            if(sq==N) return 1;
            else if(sq<N) left = mid+1;
            else right=mid-1;

            mid = left+(right-left)/2;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(checkPerfectSquare(49));
    }
}
