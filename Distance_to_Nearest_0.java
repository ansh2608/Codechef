import java.util.*;

public class Distance_to_Nearest_0 {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int [][] arr= new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int[][] result = nearestDistance(arr, N, M);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] nearestDistance(int[][] matrix, int N, int M) {
        int[][] distances = new int[N][M];
        for (int[] row : distances) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] == 0) {
                    distances[i][j] = 0;
                    queue.offer(new int[] {i, j});
                }
            }
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int[] d : directions) {
                int nx = x + d[0];
                int ny = y + d[1];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (distances[nx][ny] > distances[x][y] + 1) {
                        distances[nx][ny] = distances[x][y] + 1;
                        queue.offer(new int[] {nx, ny});
                    }
                }
            }
        }

        return distances;
    }
}
