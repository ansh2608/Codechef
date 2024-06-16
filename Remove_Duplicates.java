import java.util.*;

public class Remove_Duplicates {
    public static List<Integer> removeDuplicates(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) return nums;
        int idx = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (!nums.get(i).equals(nums.get(idx))) {
                idx++;
                nums.set(idx, nums.get(i));
            }
        }
        return new ArrayList<>(nums.subList(0, idx + 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            List<Integer> A = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                A.add(scanner.nextInt());
            }
            Collections.sort(A);
            List<Integer> distinctElements = removeDuplicates(A);
            System.out.println(distinctElements.size());
            for (int num : distinctElements) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
