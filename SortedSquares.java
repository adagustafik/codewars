import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

    private static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(x -> x * x).sorted().toArray();
    }
}
