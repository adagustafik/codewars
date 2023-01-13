import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public static void main(String[] args) {
//        returns the same string, but with all five or more letter words reversed
//       Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

        System.out.println(spinWords("Hey fellow warriors")); // returns "Hey wollef sroirraw"
        System.out.println(spinWords("This is a test")); // returns "This is a test"
        System.out.println(spinWords("This is another test")); // returns "This is rehtona test"
    }

    private static String spinWords(String s) {
        return Arrays.stream(s.split(" ")).map(x -> x.length() > 4 ? new StringBuilder(x).reverse().toString() : x).collect(Collectors.joining(" "));
    }
}
