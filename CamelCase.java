import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("the-stealth-warrior"));
        System.out.println(camelCase("The_Stealth_Warrior"));
    }

    private static String camelCase(String s) {
        var words = s.split("[-_]");
        return  words[0] + Arrays.stream(words)
                .skip(1)
                .map(w -> w.substring(0,1).toUpperCase() + w.substring(1))
                .collect(Collectors.joining());

//        var list = s.chars().boxed().map(c -> (char)c.intValue()).collect(Collectors.toList());
//        ArrayList<Character> modiList = new ArrayList<>(list);
//        for (int i = 0; i < list.size(); i++) {
//            var c = list.get(i);
//            if (c == '-' || c == '_') {
//                modiList.set(i + 1, Character.toUpperCase(list.get(i + 1)));
//            }
//        }
//        return modiList.toString().replaceAll("(?i)[^a-z]", "");
    }
}
