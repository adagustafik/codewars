import java.util.ArrayList;
import java.util.Arrays;

public class Scramblies {
    public static void main(String[] args) {
        // returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.

        System.out.println(scramble("katas", "steak")); //false
        System.out.println(scramble("scriptjavx","javascript")); //false
        System.out.println(scramble("javscripts","javascript")); //false
        System.out.println(scramble("rkqodlw", "world")); //true
        System.out.println(scramble("cedewaraaossoqqyt","codewars")); //true
    }

    private static boolean scramble(String str1, String str2) {
        var str1Arr = new ArrayList<>(Arrays.stream(str1.split("")).toList());
        var str2Arr = str2.split("");
        for (String s : str2Arr) {
            if (str1Arr.contains(s)) {
                str1Arr.remove(s);
            } else {
                return false;
            }
        }
        return true;
    }
}
