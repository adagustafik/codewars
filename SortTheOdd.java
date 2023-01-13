import java.util.Arrays;

public class SortTheOdd {
    public static void main(String[] args) {
//        You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
//        [7, 1]  =>  [1, 7]
//        [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
//        [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
        int[] nums = {7, 1};
        int[] nums2 = {5, 8, 6, 3, 4};
        int[] nums3 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(oddSort(nums)));
        System.out.println(Arrays.toString(oddSort(nums2)));
        System.out.println(Arrays.toString(oddSort(nums3)));
        System.out.println(Arrays.toString(oddSort(new int[]{3, -5, -4, 7, 0, -10, -9})));
    }
    public static int[] oddSort(int[] nums) {
        var sortedOdds = Arrays.stream(nums)
                .filter(i -> i % 2 != 0)
                .sorted()
                .iterator();

        return Arrays.stream(nums)
                .map(i -> i % 2 == 0 ? i : sortedOdds.nextInt())
                .toArray();
    }
}
