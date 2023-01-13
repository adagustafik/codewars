import java.util.Arrays;

public class RepeatedStringEASY {
    public static void main(String[] args) {
        // create a string of length n & count number of a's
        System.out.println(repeatedString("abcac", 10L)); // 4
        System.out.println(repeatedString("aba", 10L)); // 7
        System.out.println(repeatedString("a", 1000000000000L)); // 1000000000000
        System.out.println(repeatedString("gfcaaaecbg", 547602L)); // 164280
        System.out.println(repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400L)); // 51574523448

    }

    private static long repeatedString(String s, long n) {
        long repetition = n / s.length();
        long count = Arrays.stream(s.split("")).filter(x -> x.equals("a")).count();
        long overflow = n % s.length();
        long overflowCount = Arrays.stream(s.substring(0, (int)overflow).split("")).filter(x -> x.equals("a")).count();
        return (count * repetition) + overflowCount;
    }
}
