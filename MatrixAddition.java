import java.util.Arrays;

public class MatrixAddition {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(maxrixAddition(new int[][]{{1, 2, 3}, {3, 2, 1}, {1, 1, 1}}, new int[][]{{2, 2, 1}, {3, 2, 3}, {1, 1, 3}})));
    }
    private static int[][] maxrixAddition(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
}
