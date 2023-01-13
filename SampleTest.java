import java.util.List;

public class SampleTest {
    public static void main(String[] args) {
//        System.out.println(maxDifference(List.of(7, 1, 2, 5)));

        System.out.println("2002-1-11".matches("[0-9]{4}-[0-9]{2}-[0-9]{2}"));

    }

    private static int maxDifference(List<Integer> px) {
        int max = -1;
        for (int i = 0; i < px.size() - 1; i++) {
            for (int j = i + 1; j < px.size(); j++) {
                if (px.get(j) > px.get(i) && px.get(j) - px.get(i) > max) {
                    max = px.get(j) - px.get(i);
                }
            }
        }
        return max;
    }
}