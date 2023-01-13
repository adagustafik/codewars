import java.util.ArrayList;
import java.util.Stack;

public class CommonChildMEDIUM {
    public static void main(String[] args) {
        // given 2 strings, what is longest substring of both created by deleting 0 or more chars
        // order has to be maintained
        System.out.println(commonChild("ABCD", "ABDC")); // -> 2 children -> ABC, ABD -> returns length 3
        System.out.println(commonChild("HARRY", "SALLY")); // -> AY -> returns length 2
        System.out.println(commonChild("SHINCHAN", "NOHARAAA")); // -> NHA -> returns length 3
        System.out.println(commonChild("ABDCEF", "FBDAMNA")); // -> BD -> returns length 2

    }

    private static int commonChild(String s1, String s2) {
        int[][] counts = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    // count first match and store result in counts as + 1
                    counts[i][j] = counts[i - 1][j - 1] + 1;
                } else {
                    counts[i][j] = Math.max(counts[i - 1][j], counts[i][j - 1]);
                }
            }
        }
        return counts[s1.length()][s2.length()];
    }
}

//    final int[][] substringsMatrix = new int[s1.length() + 1][s2.length() + 1];
//        for (int i = 0; i <= s1.length(); i++) {
//                for (int j = 0; j <= s2.length(); j++) {
//                if (i == 0 || j == 0) {
//                substringsMatrix[i][j] = 0;
//                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
//                substringsMatrix[i][j] = substringsMatrix[i - 1][j - 1] + 1;
//                } else {
//                substringsMatrix[i][j] = (substringsMatrix[i - 1][j] > substringsMatrix[i][j - 1]) ? substringsMatrix[i - 1][j] : substringsMatrix[i][j - 1];
