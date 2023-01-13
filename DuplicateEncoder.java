import java.util.HashMap;

public class DuplicateEncoder {
//    The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string,
//    or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
//
//            Examples
//        "din"      =>  "((("
//        "recede"   =>  "()()()"
//        "Success"  =>  ")())())"
//        "(( @"     =>  "))(("

    public static void main(String[] args) {
        System.out.println(duplicateEncoder("din"));
        System.out.println(duplicateEncoder("recede"));
        System.out.println(duplicateEncoder("Success"));
        System.out.println(duplicateEncoder("(( @"));
    }

    public static String duplicateEncoder(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.toLowerCase().charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append((map.get(s.toLowerCase().charAt(i)) > 1) ? ")" : "(");
        }
        return sb.toString();
    }
}