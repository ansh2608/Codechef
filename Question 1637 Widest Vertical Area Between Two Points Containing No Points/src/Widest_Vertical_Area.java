import java.util.Arrays;

public class Widest_Vertical_Area {
    static int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));
        int max_width=0;
        for (int i=1;i< points.length;i++){
            int width=points[i][0] - points[i-1][0];
            max_width=Math.max(width,max_width);
        }
        return max_width;
    }
    public static void main(String[] args) {
        int[][] points = {{8,7},{9,9},{7,4},{9,7}};
        System.out.println(maxWidthOfVerticalArea(points));
    }
}
