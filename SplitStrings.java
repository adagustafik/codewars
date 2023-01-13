import java.util.Arrays;

public class SplitStrings {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc")));
        System.out.println(Arrays.toString(solution("abcdef")));
    }

    private static String[] solution(String s) {
        s = s.length() % 2 == 0 ? s: s + "_";
        var size = s.length() / 2;
        String[] r = new String[size];
        for (int i = 0, j = 0; i < size; i++, j += 2) {
            r[i] = s.charAt(j) + "" + s.charAt(j + 1);
        }
        return r;
    }
}
