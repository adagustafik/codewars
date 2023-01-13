public class RomanNumeralsEncoder {
    // M
    // number / 1000 -> MMM
    // number % 1000 -> D
    // number / 500 -> DDD
    // number % 500 -> C

    public static void main(String[] args) {
        System.out.println(conversion(1000));
        System.out.println(conversion(3000));
    }

    public static String conversion(int n) {
        StringBuilder sb = new StringBuilder();
        int residue = n;
        int thousands = n / 1000;
        residue = n - (thousands * 1000);
        int fiveHundreds = (residue % 1000) / 500;
        residue = n - (fiveHundreds * 500);
        int hundreds = (residue % 1000) / 100;

        sb
                .append(convertOne("M", thousands))
                .append(convertOne("D", fiveHundreds));
        return sb.toString();
    }

    public static StringBuilder convertOne(String letter, int repeat) {
        StringBuilder sb = new StringBuilder();
        sb.append(letter.repeat(Math.max(0, repeat)));
        return sb;
    }
}
