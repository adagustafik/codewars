public class AlternatingCharactersEASY {
    public static void main(String[] args) {
        // you are given a string of As & Bs
        // create string with no matching adjacent chars
        // return minimum number of required deletions
        System.out.println(alternatingCharacters("AABAAB")); //2 [0,3]
        System.out.println(alternatingCharacters("AAAA")); //3
        System.out.println(alternatingCharacters("ABABABAB")); //0
        System.out.println(alternatingCharacters("AAABBB")); //4

    }

    private static int alternatingCharacters(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
        }
        return count;
    }
}
