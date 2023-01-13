import java.util.ArrayList;
import java.util.Arrays;

public class SudokuValidator {

    public static void main(String[] args) {

        System.out.println(validate(new int[][]{{5, 3, 4, 6, 7, 8, 9, 1, 2}, {6, 7, 2, 1, 9, 5, 3, 4, 8}, {1, 9, 8, 3, 4, 2, 5, 6, 7}, {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1}, {7, 1, 3, 9, 2, 4, 8, 5, 6}, {9, 6, 1, 5, 3, 7, 2, 8, 4}, {2, 8, 7, 4, 1, 9, 6, 3, 5}, {3, 4, 5, 2, 8, 6, 1, 7, 9}}));
        System.out.println(validate(new int[][]{{5, 3, 4, 6, 7, 8, 9, 1, 2}, {6, 7, 2, 1, 9, 0, 3, 4, 8}, {1, 0, 0, 3, 4, 2, 5, 6, 0}, {8, 5, 9, 7, 6, 1, 0, 2, 0},
                {4, 2, 6, 8, 5, 3, 7, 9, 1}, {7, 1, 3, 9, 2, 4, 8, 5, 6}, {9, 0, 1, 5, 3, 7, 2, 1, 4}, {2, 8, 7, 4, 1, 9, 6, 3, 5}, {3, 0, 0, 4, 8, 1, 1, 7, 9}}));
    }

    private static final int[] NUMS = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static boolean validate(int[][] array) {

        ArrayList<Boolean> comparison = new ArrayList<>();
        for (int i = 0; i < 9; i += 3) {
            int[] sub = new int[9];
            for (int j = 0, l = 0; j < 3; j++, l += 3) {
                for (int k = 0; k < 3; k++) {
                    sub[k] = array[i][l + k];
                    sub[k + 3] = array[i + 1][l + k];
                    sub[k + 6] = array[i + 2][l + k];
                }
            }
            Arrays.sort(sub);
            comparison.add(Arrays.equals(sub, NUMS));
        }
        for (int i = 0; i < 9; i++) {
            int[] column = new int[9];
            for (int j = 0; j < 9; j++) {
                column[j] = array[j][i];
            }
            Arrays.sort(column);
            comparison.add(Arrays.equals(column, NUMS));
        }
        for (int[] ints : array) {
            Arrays.sort(ints);
            comparison.add(Arrays.equals(ints, NUMS));
        }
        return (!comparison.contains(false));
    }
}