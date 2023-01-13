import java.util.Arrays;

public class CompareTriplets {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(compareTriplets(new int[]{5, 6, 7}, new int[]{3, 6, 10})));
        System.out.println(Arrays.toString(compareTriplets(new int[]{17, 28, 30}, new int[]{99, 16, 8})));
    }

    private static int[] compareTriplets(int[] a, int[] b) {
        int[] results = {0,0};
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                results[0] += 1;
            } else if (a[i] < b[i]) {
                results[1] += 1;
            }
        }
        return results;
    }
}
