import java.util.Arrays;

public class Main {
    public static long findSwapValues(long[] a, int n, long[] b, int m) {
        long sumOfArray1 = 0,sumOfArray2 = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(long element : a) sumOfArray1 += element;
        for(long element : b) sumOfArray2 += element;
        long target = (sumOfArray1-sumOfArray2);
        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            long cur = 2* (a[i] - b[j]);
            if(cur == target) return 1;
            else if(cur < target) i++;
            else j++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 6, m = 4;
        long[] a = {4, 1, 2, 1, 1, 2};
        long[] b = {3, 6, 3, 3};
        System.out.println(findSwapValues(a,n,b,m));
    }
}