import java.util.*;

public class LongestRepetition {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(longestRepetition("aaaabb"))); // returns Object[]{"a", 4}
        System.out.println(Arrays.toString(longestRepetition("bbbaaabaaaa"))); // returns Object[]{"a", 4}
        System.out.println(Arrays.toString(longestRepetition("cbdeuuu9000"))); // returns Object[]{"u", 3}
        System.out.println(Arrays.toString(longestRepetition("aabb"))); // returns Object[]{"a", 2}
        System.out.println(Arrays.toString(longestRepetition(""))); // returns Object[]{"a", 2}

    }
    private static Object[] longestRepetition(String s) {
        int count = 1;
        int max = 0;
        String result = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) {
                count++;
                if (count > max) {
                    max = count;
                    result = s.substring(i + 1, i + 2);
                }
            } else {
                count = 1;
            }

        }
        return new Object[]{result, max};

//        if (s.length() == 0) {
//            return new Object[]{"", 0};
//        }
//        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
//        for (int i = 0, count = 1; i < s.length() - 1; i++) {
//            if (s.charAt(i) == s.charAt(i + 1)) {
//                count++;
//                String c = s.substring(i, i + 1);
//                if (Objects.isNull(map.get(c))) {
//                    map.put(c, count);
//                } else {
//                    map.replace(c, count);
//                }
//            } else {
//                count = 1;
//                String c = s.substring(i, i + 1);
//                if (Objects.isNull(map.get(c))) {
//                    map.put(c, count);
//                }
//            }
//        }
//        Map.Entry<String, Integer> result = null;
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if (result == null || entry.getValue() > result.getValue()) {
//                result = entry;
//            }
//        }
//        return new Object[]{result.getKey(), result.getValue()};
    }
}
