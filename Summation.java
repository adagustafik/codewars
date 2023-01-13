import java.util.stream.IntStream;

public class Summation {
    public static void main(String[] args) {
        System.out.println(summation(2));
        System.out.println(summation(8));
    }

    private static int summation(int n) {
        return IntStream.range(1,n + 1).sum();
    }
}
