
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.stream.IntStream;

public class SumOfIntervals {

    public static void main(String[] args) {
        System.out.println(sumIntervals(new int[][]{{1, 4}, {7, 10}, {3, 5}})); // 7
        System.out.println(sumIntervals(new int[][]{})); // 7
        System.out.println(sumIntervals(null)); // 7
        System.out.println(sumIntervals(new int[][]{{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}})); // 19
    }

    private static int sumIntervals(int[][] ints) {
        if (ints == null || ints.length == 0) { return 0; }
        var intervals = Arrays.stream(ints).sorted(Comparator.comparingInt(x -> x[0])).map(x -> new Interval(x[0], x[1])).toArray(Interval[]::new);
        Stack<Interval> stack = new Stack<>();
        stack.push(intervals[0]);
        // start from the next interval and merge if necessary
        for (int i = 1; i < intervals.length; i++) {
            Interval top = stack.peek();
            // if no overlap -> push to stack
            if (top.end < intervals[i].start) {
                stack.push(intervals[i]);
            }
            // else if ending time of this interval is higher then ending time of top -> update top
            else if (top.end < intervals[i].end) {
                top.end = intervals[i].end;
                stack.pop();
                stack.push(top);
            }
        }
        // count lengths sum
        return (int) stack.stream().map(x -> IntStream.range(x.start, x.end).count()).mapToLong(Long::longValue).sum();
    }

    public static class Interval {
        int start, end;
        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
