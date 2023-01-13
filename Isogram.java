import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Isogram {
    public static void main(String[] args) {
//    Create a function called isogram that takes a string as an input and returns a boolean value whether a string is a isogram or not.
//    ISOGRAM - each letter occurs only once - case-insensitive - space is ignored - string length < 1 returns false
//    string has to be at least one character long, otherwise the result is by DEFAULT "false"

        System.out.println(isogram("E v an")); //true
        System.out.println(isogram("carrot")); //false
        System.out.println(isogram(" ")); //false
        System.out.println(isogram("Readily")); //true
        System.out.println(isogram("UNCOPYRIGHTABLE")); //true
        System.out.println(isogram("He is moral")); //true
    }
    private static boolean isogram(String s) {
        if (s.isBlank()){
            return false;
        }
        return Arrays.stream(s.toLowerCase().replace(" ", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(e -> e.getValue() > 1).findAny().isEmpty();
    }
}
