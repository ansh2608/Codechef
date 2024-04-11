import java.util.*;

public class Total_Correct_Submissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            HashMap<String,Integer> map = new HashMap<>();
            for(int i=0;i<n*3;i++) {
                String s = sc.next();
                int num = sc.nextInt();
                if(map.containsKey(s)) {
                    int sum = map.get(s);
                    sum = sum + num;
                    map.put(s,sum);
                }
                else map.put(s,num);
            }
            int[] arr = new int[map.size()];
            int i = 0;
            for(Map.Entry<String,Integer> ele : map.entrySet()) arr[i++] = ele.getValue();
            Arrays.sort(arr);
            for(int j : arr) System.out.print(j+" ");
            System.out.println();
        }
    }
}
