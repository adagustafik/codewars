import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoToOne {
    public static void main(String[] args) {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }
    private static String longest(String s1, String s2) {
        return Stream.concat(Arrays.stream(s1.split("")), Arrays.stream(s2.split(""))).distinct().sorted().collect(Collectors.joining());
    }
}
