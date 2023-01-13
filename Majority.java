import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Majority {
    public static void main(String[] args) {
        System.out.println(majority(3, new int[]{1,2,1})); // 1
        System.out.println(majority(4, new int[]{1,2,1,2})); // -1
    }

    private static int majority(int n, int[] nums) {
        var count = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > n/2).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        int max = -1;
        if (count.size() > 0) {
            max = Collections.max(count.keySet());
        }
        return max;
    }
}
