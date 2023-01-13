import java.util.Arrays;

public class TwoStringsEASY {
    public static void main(String[] args) {
        // given 2 strings, determine whether they share a common substring
        System.out.println(twoStrings("and", "art")); // YES - letter a
        System.out.println(twoStrings("hello", "world")); // YES - letter o and l
        System.out.println(twoStrings("hi", "world")); // NO

    }

    private static String twoStrings(String s1, String s2) {
        return Arrays.stream(s1.split("")).distinct().filter(s2::contains).toList().size() > 0 ? "YES" : "NO";
    }
}
