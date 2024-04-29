import java.util.*;

public class Snake_Eating {
    public static void main (String[] args) {
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        while(t!=0){
            ArrayList<Pair> qr = new ArrayList<>();
            int n=in.nextInt();
            int q=in.nextInt();
            int[] a=new int[100009];
            int[] ans=new int[100009];
            for(int i=1;i<n+1;i++) a[i]=in.nextInt();
            for (int i=0;i<q;i++) {
                int x=in.nextInt();
                qr.add(new Pair(x, i));
            }
            Arrays.sort(a,1,n+1);
            Collections.sort(qr);
            int cur=0;
            int prev=0;
            int presum=0;
            int i;
            for (i=1; ;i++) {
                int fir=qr.get(cur).first;
                while(a[i]<fir && i<n+1) {
                    presum+=(fir-a[i]);
                    i++;
                }
                i--;
                while(presum>prev) {
                    prev++;
                    presum-=(fir-a[prev]);
                }
                ans[qr.get(cur).second]=n-prev;
                if(cur==q-1) break;
                presum=presum+(i-prev)*(qr.get(cur+1).first-fir);
                cur++;
            }
            for (int j=0;j<q;j++) System.out.println(ans[j]);
            t--;
        }
    }
    static class Pair implements Comparable<Pair> {
        int first;
        int second;
        Pair(int first,int second) {
            this.first=first;
            this.second=second;
        }
        public int compareTo(Pair p) {
            return Integer.compare(this.first,p.first);
        }
    }
}
