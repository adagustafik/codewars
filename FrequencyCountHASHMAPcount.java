import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCountHASHMAPcount {
    public static void main(String[] args) {
        System.out.println(frequency("babdc")); // -> a1b2c1d1
        System.out.println(frequency("phqgh")); // -> g1h2p1q1
    }

    private static String frequency(String s) {
        StringBuilder sb = new StringBuilder();
        var r = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Comparator.comparingInt(x -> x.getKey().charAt(0))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Long::sum, LinkedHashMap::new));
        for (Map.Entry<String, Long> entry : r.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue());
        }
        return sb.toString();
    }
}
