public class CountValleysEASY {
    public static void main(String[] args) {
        System.out.println(countingValleys(8, "DDUUUUDD")); //1 - \\// //\\
        System.out.println(countingValleys(8, "UDDDUDUU")); //1 - /\ \\/\//
        System.out.println(countingValleys(10, "DDUDDUUDUU")); //1 - \\/\\//\//
    }

    private static int countingValleys(int steps, String path) {
        // entering a valley -> below see level
        int valleys = 0;
        int level = 0;
        for (int i = 0; i < path.length(); i++) {
            if (level == 0 && path.charAt(i) == 'D') {
                valleys++;
            }
            if (path.charAt(i) == 'U') {
                level++;
            }
            if (path.charAt(i) == 'D') {
                level--;
            }
        }
        return valleys;
    }
}
