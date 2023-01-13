import java.util.Arrays;
import java.util.stream.Collectors;

public class Maskify {
    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify("1"));
    }

    private static String maskify(String s) {
        StringBuilder sb = new StringBuilder();
        int breakPoint = s.length() < 4 ? 0 : s.length() - 4;
        return sb.append(Arrays.stream(s.split("")).limit(breakPoint).map(x -> "#").collect(Collectors.joining())).append(s.substring(breakPoint)).toString();
    }
}
