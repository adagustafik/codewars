import java.util.Arrays;

public class GreedIsGod {
    public static void main(String[] args) {
        // Three 1's => 1000 points
        // Three 6's =>  600 points
        // Three 5's =>  500 points
        // Three 4's =>  400 points
        // Three 3's =>  300 points
        // Three 2's =>  200 points
        // One   1   =>  100 points
        // One   5   =>   50 point
        // A single die can only be counted once in each roll. For example, a given "5" can only count as part of a triplet (contributing to the 500 points) or as a single 50 points, but not both in the same roll.
        //
        // Throw       Score
        // ---------   ------------------
        // 5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
        // 1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
        // 2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)
        System.out.println(greed(new int[]{1, 1, 1, 3, 1}));
        System.out.println(greed(new int[]{5, 1, 3, 4, 1}));
        System.out.println(greed(new int[]{2, 4, 4, 5, 4}));
    }
    public static int greed(int[] nums) {
        Arrays.sort(nums);
        int triple = 0;
        for (int i = 0; i < 3; i++) {
            if ((nums[i] == nums[i + 1]) && (nums[i + 1] == nums[i + 2])) {
                triple = nums[2];
                break;
            }
        }
        int points = 0;
        points = (triple == 1) ? 1000 : triple * 100;
        int count1 = 0, count5 = 0;
        for (int num : nums) {
            if (num == 1) count1++;
            if (num == 5) count5++;
        }
        points += (count1 % 3) * 100;
        points += (count5 % 3) * 50;
        return points;
    }
}
