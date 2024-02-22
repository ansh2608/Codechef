import java.util.Scanner;

public class Average_Permutation {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0;i < T;i++)
        {
            int N = sc.nextInt();
            int[] arr = new int[N];
            arr[0] = N;
            arr[N-1] = N-1;
            if(N%2 == 0)
            {
                int m = N-2;
                int j = 1;
                while(j < N/2)
                {
                    arr[j] = m;
                    m-=2;
                    j++;
                }
                int k = N-3;
                int p = N-2;
                while(p >= N/2)
                {
                    arr[p] = k;
                    k-=2;
                    p--;
                }
            }
            else{
                int m = N-2;
                int j = 1;
                while(j <= N/2)
                {
                    arr[j] = m;
                    m-=2;
                    j++;
                }
                int k = N-3;
                int p = N-2;
                while(p > N/2)
                {
                    arr[p] = k;
                    k-=2;
                    p--;
                }
            }
            for(int g = 0;g < N;g++)
            {
                System.out.print(arr[g]+" ");
            }
            System.out.println();

        }
    }
}

