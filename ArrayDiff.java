import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDiff {
    public static void main(String[] args) {
//        Your goal in this kata is to implement a difference function, which  remove all values from list a, which are present in list b keeping their order.
//        If a value is present in b, all of its occurrences must be removed from the other:

        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2})));
    }
    private static int[] arrayDiff(int[] a, int[] b) {
        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();

//        ArrayList<Integer> listA = new ArrayList<>(Arrays.stream(a).boxed().toList());
//        Arrays.stream(b).forEach(x -> listA.removeAll(List.of(x)));
//        return listA.stream().mapToInt(Integer::valueOf).toArray();
    }
}
