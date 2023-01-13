import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class SherlockAndTheValidStringMEDIUM {
    public static void main(String[] args) {
        // string is valid, if all characters appear same number of times
        // + you can remove one character
        System.out.println(isValid("abcc")); // YES -> all occur once + we delete c that occurs twice
        System.out.println(isValid("abccc")); // NO -> 2 x 1 + 1 x 3
        System.out.println(isValid("aabbcd")); // NO -> 2 x 2 + 2 x 1
        System.out.println(isValid("abcdefghhgfedecba")); // YES -> all chars occur twice + we delete e that occurs 3 times
    }

    private static String isValid(String s) {
        Map<String, Long> mapCounts = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Long, Long> countCounts = new HashMap<>();
        for (Long l : mapCounts.values()) {
            countCounts.put(l, countCounts.getOrDefault(l, 0L) + 1);
        }
        if (countCounts.size() == 1) {
            return "YES";
        } else if (countCounts.size() > 2) {
            return "NO";
        }
        Map.Entry<Long, Long> minCount = countCounts.entrySet().stream().reduce((x, y) -> x.getValue() < y.getValue() ? x : y).get();
        Map.Entry<Long, Long> maxCount = countCounts.entrySet().stream().reduce((x, y) -> x.getValue() > y.getValue() ? x : y).get();
        return minCount.getValue() > 1 || minCount.getKey() > maxCount.getKey() + 1 ? "NO" : "YES";
    }
}
