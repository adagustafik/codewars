import java.util.Arrays;

public class SeparateWheatFromChaff {
    public static void main(String[] args) {
//        If a misplaced positive number is found in the front part of the sequence, replace it with the last misplaced negative number (the one found near the end of the input).
//        The second misplaced positive number should be swapped with the second last misplaced negative number. Negative numbers found at the head (begining) of the sequence , should be kept in place .

        System.out.println(Arrays.toString(wheatFromChaff(new long[]{-2, -4, -6}))); // -2,-4,-6
        System.out.println(Arrays.toString(wheatFromChaff(new long[]{3, 6, 24}))); // 3,6,24
        System.out.println(Arrays.toString(wheatFromChaff(new long[]{2, -4, 6, -6, 7}))); // -6,-4,6,2
        System.out.println(Arrays.toString(wheatFromChaff(new long[]{-30, -11, 36, 38, 34, -5, -50}))); // -30, -11, -50, -5, 34, 38, 36
    }

    private static long[] wheatFromChaff(long[] values) {
        var result = values.clone();
        for (int left = 0, right = values.length - 1; left < right; left++) {
            if (result[left] > 0) {
                while (right > left)
                    if (result[right] < 0) {
                        long temp = result[right];
                        result[right] = result[left];
                        result[left] = temp;
                        right--;
                        break;
                    } else {
                        right--;
                    }
            }
        }
        return result;
    }
}
