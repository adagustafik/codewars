import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generate(4)));
    }

    private static long[] generate(int level) {
        List<List<Long>> rows = new ArrayList<>();
        List<Long> row = new ArrayList<>();
        for (int i = 0; i < level; i++) {
            row.add(0, 1L);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            rows.add(new ArrayList<>(row));
        }
        return rows.stream().flatMap(Collection::stream).mapToLong(Long::valueOf).toArray();
    }
}
