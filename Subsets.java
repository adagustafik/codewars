import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
//        Given an integer array nums of unique elements, return all possible subsets (the power set).
//        The solution set must not contain duplicate subsets. Return the solution in any order.
        System.out.println(subsets(new int[]{1, 2, 3}));
//        System.out.println(subsets(new int[]{0}));
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int n : nums) {
            int s = result.size();
            for (int i = 0; i < s; i++) {
                List<Integer> set = new ArrayList<>(result.get(i));
                set.add(n);
                result.add(set);
            }
        }
        return result;
    }
}
