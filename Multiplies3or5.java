import java.util.stream.IntStream;

public class Multiplies3or5 {
    public static void main(String[] args) {
//        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//        Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
//        Additionally, if the number is negative, return 0 (for languages that do have them).
//        Note: If the number is a multiple of both 3 and 5, only count it once.

        System.out.println(multiplies3or5(10));
        System.out.println(multiplies3or5(-5));
    }
    private static int multiplies3or5(int n) {
        return IntStream.range(0, n)
                .filter(x -> x % 3 == 0 || x % 5 == 0)
                .reduce(Integer::sum).orElse(0);
    }
}
