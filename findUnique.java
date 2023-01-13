import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findUnique {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
        System.out.println(findUniq(new double[]{0, 0, 0.55, 0, 0}));
    }

    private static double findUniq(double[] n) {
        return Arrays.stream(n).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.reducing(0, e -> 1, Integer::sum)))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findAny().orElse(Map.entry(0.,0)).getKey();

//        var list = Arrays.stream(n).boxed().toList();
//        return Arrays.stream(n).filter(x -> list.indexOf(x) == list.lastIndexOf(x)).findAny().orElse(0.);
    }
}
