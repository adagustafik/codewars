import java.util.Arrays;

public class AnagramDetection {
    public static void main(String[] args) {
        //    An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
        //    Note: anagrams are case insensitive
        System.out.println(isAnagram("foefe", "toffee")); // false
        System.out.println(isAnagram("Buckethead", "DeathCubeK")); // true
    }
    public static boolean isAnagram(String s1, String s2) {
        return Arrays.compare(convertToArr(s1), convertToArr(s2)) == 0;
    }
    public static String[] convertToArr(String s) {
        return Arrays.stream(s.toLowerCase().split("")).sorted().toArray(String[]::new);
    }
}
