import java.util.Arrays;

public class HighAndLow {
    public static void main(String[] args) {
//        highAndLow("1 2 3 4 5");  // return "5 1"
//        highAndLow("1 2 -3 4 5"); // return "5 -3"
//        highAndLow("1 9 3 4 -5"); // return "9 -5"
        System.out.println(highAndLow("1 2 3 4 5"));
        System.out.println(highAndLow("1 2 -3 4 5"));
        System.out.println(highAndLow("1 9 3 4 -5"));
    }

    private static String highAndLow(String s) {
        var stats = Arrays.stream(s.split(" ")).mapToInt(Integer::valueOf).summaryStatistics();
        return stats.getMax() + " " + stats.getMin();
    }
}
