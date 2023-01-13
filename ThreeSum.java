import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ThreeSum {
    public static void main(String[] args) {
        // find 3 non unique elements in array for smallest sum and return their indexes
        System.out.println(Arrays.toString(threeSum(new int[]{1, 2, 3, 4, 5}))); // returns [0,1,2]
        System.out.println(Arrays.toString(threeSum(new int[]{100, 450, 200, 5}))); // returns [0,2,3]
    }

    public static int[] threeSum(int[] nums) {
        var numsArr = Arrays.stream(nums).boxed().toList();
        return IntStream.of(nums).sorted().limit(3).map(numsArr::indexOf).sorted().toArray();
    }
}
