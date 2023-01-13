import java.util.Arrays;
import java.util.stream.IntStream;

public class FinalExam {
    public static void main(String[] args) {
        System.out.println(closestDistance(new int[]{3, 6, 12, 1})); // 2
        System.out.println(closestDistance(new int[]{1, 3, 98, 5, 99})); // 1
        System.out.println(closestDistance(new int[]{1})); // -1
    }
    public static int closestDistance(int[] nums) {
//        if (nums.length < 2) {
//            return -1;
//        }
//        ArrayList<Integer> distances = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                distances.add(Math.abs(nums[i] - nums[j]));
//            }
//        }
//        return Collections.min(distances);

        var nums2 = Arrays.stream(nums).sorted().toArray();
        return IntStream.range(1, nums2.length).map(i -> Math.abs(nums2[i] - nums2[i - 1])).min().orElse(-1);

    }
}
