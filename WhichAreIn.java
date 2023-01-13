import java.util.Arrays;

public class WhichAreIn {
    public static void main(String[] args) {
        // Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2. No duplicates.
        System.out.println(Arrays.toString(inArray(new String[]{"arp", "live", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));
    }

    private static String[] inArray(String[] a, String[] b) {
        return Arrays.stream(a).filter(x -> Arrays.stream(b).anyMatch(y -> y.contains(x))).distinct().sorted().toArray(String[]::new);
//        ArrayList<String> results = new ArrayList<>();
//        for (String s : a) {
//            for (String value : b) {
//                if (value.contains(s)) {
//                    if (!results.contains(s)) {
//                        results.add(s);
//                    }
//                }
//            }
//        }
//        Collections.sort(results);
//        return results.toArray(new String[0]);
    }
}
