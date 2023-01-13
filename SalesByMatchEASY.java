import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SalesByMatchEASY {
    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{1,2,1,2,1,3,2}));
    }
    private static int countPairs(int[] nums) {
        var count = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream().map(a -> a/ 2).mapToLong(Long::longValue).sum();
        return (int)count;
    }
}
