import java.util.Arrays;

public class FindUniqueNumber {
    public static void main(String[] args) {
        //There is an array with some numbers. All numbers are equal except for one. Try to find it!
        //It’s guaranteed that array contains at least 3 numbers.
        //The tests contain some very huge arrays, so think about performance.
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
        System.out.println(findUniq(new double[]{0, 0, 0.55, 0, 0}));
    }
    public static double findUniq(double[] nums) {
        Arrays.sort(nums);
        return (nums[0] == nums[1]) ? nums[nums.length - 1] : nums[0];
    }
}
