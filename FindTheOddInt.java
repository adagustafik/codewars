import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheOddInt {
    public static void main(String[] args) {
//        Given an array of integers, find the one that appears an odd number of times.
//        There will always be only one integer that appears an odd number of times.

        System.out.println(findTheOddInt(new int[]{0,1,0,1,0}));
        System.out.println(findTheOddInt(new int[]{1,2,2,3,3,3,4,3,3,3,2,2,1}));
    }

    private static int findTheOddInt(int[] nums) {
        return Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() % 2 == 1)
                .findAny().get()
                .getKey();
    }
}
