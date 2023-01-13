import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RotateLeft {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotLeft(new int[]{1, 2, 3, 4, 5}, 3)));
    }

    private static int[] rotLeft(int[] nums, int d) {
        return IntStream.range(0, nums.length).map(x -> nums[(x - d + nums.length) % nums.length]).toArray();
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        ArrayList<Integer> shifted = new ArrayList<>(a);
        for (int i = 0; i < d; i++) {
            int temp = shifted.get(0);
            shifted.remove(0);
            shifted.add(temp);
        }
        return shifted;
    }
}
