import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
        // return sum of all digits
        System.out.println(digitalRoot(16));
        System.out.println(digitalRoot(942));
        System.out.println(digitalRoot(132189));
        System.out.println(digitalRoot(493193));
    }

    private static int digitalRoot(int n) {
        while ( n / 10 != 0) {
            n = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
        }
        return n;
    }
}
