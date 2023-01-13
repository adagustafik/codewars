import java.util.ArrayList;

public class ShortestUniqueSubstring {
    public static void main(String[] args) {
        System.out.println(getShortestUniqueSubstring(new char[]{'x', 'y', 'z'}, "xyyzyzyx")); //xyz
        System.out.println(getShortestUniqueSubstring(new char[]{'a', 'b', 'c'}, "xyyzyzyx")); //""
    }
    private static String getShortestUniqueSubstring(char[] arr, String str) {
        ArrayList<String> substrings = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        for (int i = 0; i < str.length() - arr.length + 1; i++) {
            substrings.add(str.substring(i, i + arr.length));
        }
        for (String substring: substrings) {
            boolean isSubstring = true;
            for (char c : arr) {
                if (!substring.contains(String.valueOf(c))) {
                    isSubstring = false;
                    break;
                }
            }
            if (isSubstring) {
                results.add(substring);
            }
        }
        return results.toString();
    }
}
