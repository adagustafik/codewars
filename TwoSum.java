import java.util.Arrays;

public class TwoSum {
//    Write a function that takes an array of numbers (integers for the tests) and a target number.
//    It should find two different items in the array that, when added together, give the target value.
//    The indices of these items should then be returned in a tuple like so: (index1, index2).
//    For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
//    The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers;
//    target will always be the sum of two different items from that array).
//
//    Based on: http://oj.leetcode.com/problems/two-sum/
//
//    twoSum [1, 2, 3] 4 === (0, 2)

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumTarget(new int[] {3, 2, 4}, 6)));
    }

    public static int[] sumTarget(int[] array, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] + array[j] == target) {
                    indices[0] = j;
                    indices[1] = i;
                    break;
                }
            }
        }
        return indices;
    }
}
