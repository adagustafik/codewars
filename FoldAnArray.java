import java.util.ArrayList;
import java.util.Arrays;

public class FoldAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(foldArray(new int[]{1, 2, 3, 4, 5}, 1)));
        System.out.println(Arrays.toString(foldArray(new int[]{1, 2, 3, 4, 5}, 2)));
    }

    private static int[] foldArray(int[] array, int runs) {
        ArrayList<Integer> entry = new ArrayList<>(Arrays.stream(array).boxed().toList());
        for (int i = 0; i < runs; i++) {
            ArrayList<Integer> result = new ArrayList<>();
            int middle = entry.size() / 2;
            for (int j = 0; j < middle; j++) {
                result.add(entry.get(j)+ entry.get(entry.size() - 1 - j));
            }
            if (entry.size() % 2 == 1) {
                result.add(entry.get(middle));
            }
            entry = result;
        }

        return entry.stream().mapToInt(Integer::intValue).toArray();
    }
}
