import java.util.Arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
    }
    private static int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).map(x -> Arrays.stream(x).sum()).mapToInt(Integer::intValue).max().orElse(0);
    }
}
