import java.util.Arrays;
import java.util.stream.Collectors;

public class SimplePigLatin {
    public static void main(String[] args) {
//      Move the first letter of each word to the end of it, then add "ay" to the end of the word.
//      Leave punctuation marks untouched.
//      igPay atinlay siay oolcay
//      elloHay orldway !

        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello, world !"));
    }

    private static String pigIt(String s) {
//        return s.replaceAll("(\\w)(\\w*)", "$2$1ay");
        return Arrays.stream(s.split(" "))
                .map(x -> x.matches("(?i)[a-z]+") ? x.substring(1).concat(x.substring(0,1)).concat("ay") :
                        x.length() > 1 ? x.substring(1, x.length() - 1).concat(x.substring(0, 1)).concat("ay").concat(x.substring(x.length() -1)) : x)
                .collect(Collectors.joining(" "));
    }
}
