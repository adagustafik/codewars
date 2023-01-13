import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {

//        Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
//        Then print the respective minimum and maximum values as a single line of two space-separated long integers
//        Example 1 3 5 7 9
//        The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24. The function prints 16 24

//        System.out.println(minMaxSum(new int[]{1,2,3,4,5}));
//        System.out.println(minMaxSum(new int[]{1,3,5,7,9}));
        System.out.println(minMaxSum(List.of(1,2,3,4,5)));
        System.out.println(minMaxSum(List.of(1,3,5,7,9)));
        System.out.println(minMaxSum(List.of(256741038,623958417,467905213,714532089,938071625)));
    }

    private static String minMaxSum(List<Integer> arr) {
        var max = arr.stream().sorted().skip(1).mapToLong(Integer::intValue).sum();
        var min = arr.stream().sorted(Comparator.reverseOrder()).skip(1).mapToLong(Integer::intValue).sum();
        return min + " " + max;
    }


//    private static String minMaxSum(int[] arr) {
//        var max = Arrays.stream(arr).sorted().skip(1).sum();
//        var min = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).skip(1).mapToInt(Integer::intValue).sum();
//    return min + "  " + max;
//    }
}
