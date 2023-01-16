import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareEveryDigit {
    public static void main(String[] args) {
        System.out.println(square(9119));
    } // 811181

    private static int square(int n) {
        return Integer.parseInt(Arrays.stream(String.valueOf(n).split("")).map(x -> { int y = Integer.parseInt(x); return String.valueOf( y * y); }).collect(Collectors.joining()));
    }
}
