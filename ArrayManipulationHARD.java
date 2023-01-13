import java.util.Arrays;
import java.util.List;

public class ArrayManipulationHARD {
    public static void main(String[] args) {
        // int n -> size of new array
        // List.of(start, end, amount) of adding operation
        // get max number after performing all operations
        System.out.println(arrayManipulation(10, List.of(List.of(1, 5, 3), List.of(4, 8, 7), List.of(6, 9, 1)))); //10
        System.out.println(arrayManipulation(5, List.of(List.of(1, 2, 100), List.of(2, 5, 100), List.of(3, 4, 100)))); //200 [100, 100, 0, -100]
    }

    private static long arrayManipulation(int n, List<List<Integer>> queries) {
        // to optimize the solution instead of direcly incrementing an array
        // we save only "the sum of + (start) and - (end) operations
        // we execute the array of "final operations" to get our final array
        // and retrieve the max value
        long[] increments = new long[n];
        for (List<Integer> query : queries) {
            int end = query.get(1);
            int amount = query.get(2);
            increments[query.get(0) - 1] += amount;
            if (end < increments.length) {
                increments[end] -= amount;
            }
        }
        for (int i = 1; i < increments.length; i++) {
            increments[i] += increments[i - 1];
        }
        return Arrays.stream(increments).max().getAsLong();
    }
}
