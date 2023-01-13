public class HowManyPages {
    public static void main(String[] args) {

        // summary=25 -> 1234567891011121314151617 -> 17 number of pages
        System.out.println(amountOfPages(25)); // 17
        System.out.println(amountOfPages(5)); // 5
        System.out.println(amountOfPages(185)); // 97
        System.out.println(amountOfPages(1095));  // 401
        System.out.println(amountOfPages(660)); // 256
    }

    private static int amountOfPages(int s) {
        return s > 38889 ? 9999 + (s - 38889) / 5 :
                s > 2889 ? 999 + (s - 2889) / 4 :
                s > 189 ? 99 + (s - 189) / 3 :
                s > 9 ? 9 + (s - 9) / 2 : s;
//        int i = 9;
//        int tens = 90 * 2;
//        int huns = 900 * 3;
//        int thous = 9000 * 4;
//        int tthous = 90000 * 5;
//        if (summary > i + tthous + tens + huns + thous) {
//            return i + tens / 2 + huns / 3 + thous / 4 + tthous / 5 + (summary - tthous - thous - huns - tens - i) / 6;
//        }
//        if (summary > i + tens + huns + thous) {
//            return i + tens / 2 + huns / 3 + thous / 4 + (summary - thous - huns - tens - i) / 5;
//        }
//        if (summary > i + tens + huns) {
//            return i + tens / 2 + huns / 3 + (summary - huns - tens - i) / 4;
//        }
//        if (summary > i + tens) {
//            return i + tens / 2 + (summary - tens - i) / 3;
//        }
//        if (summary > i) {
//            return i + (summary - i) / 2;
//        }
//        return summary;
    }
}
