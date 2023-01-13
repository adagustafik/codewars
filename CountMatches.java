public class CountMatches {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(7)); // 6
        System.out.println(numberOfMatches(14)); // 13
    }

    private static int numberOfMatches(int n) {
        int count = 0;
        while (n > 1) {
            count += n / 2;
            n = n % 2 == 0 ? n / 2 : (n / 2) + 1;
        }
        return count;
    }
}
