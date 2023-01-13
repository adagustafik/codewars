import java.util.Arrays;
import java.util.stream.Stream;

public class Rotate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println(Arrays.toString(rotate(new int[]{-1, -100, 3, 99}, 2)));

        int[] numi = {1,2,3,4,5,6,7};
        numi = rotate(numi, 3);
        System.out.println(Arrays.toString(numi));
    }

    private static int[] rotate(int[] nums, int k) {
        return Stream.concat(Arrays.stream(nums).boxed().skip(nums.length - k), Arrays.stream(nums).boxed().limit(nums.length - k)).mapToInt(Integer::intValue).toArray();
    }
}
