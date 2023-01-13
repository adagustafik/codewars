
public class SpecialStringAgainMEDIUM {
    public static void main(String[] args) {
        // a substring is special if all chars are same -> aaa
        // all chars are same except the middle one -> aadaa
        System.out.println(substrCount(8, "mnonopoo")); //12 {m, n, o, n, o, p, o, o, non, ono, opo, oo}
//        System.out.println(substrCount(5, "asasd")); //7  -> 5 + {asa,sas}
//        System.out.println(substrCount(7, "abcbaba")); //10 -> 7 + {bcb, bab, aba}
//        System.out.println(substrCount(4, "aaaa")); //10 -> 4 + {aa, aa, aa, aaa, aaa, aaaa}

    }

    private static long substrCount(int n, String s) {
        long result = n;
        int countPalidrome = 1;
        for (int i = 0; i < n; i++) {
            int j = i;
            // checking aaa string
            while (++j < n && s.charAt(i) == s.charAt(j)) {
                result++;
                countPalidrome++;
            }
            // checking aba string
            while (++j < n && s.charAt(i) == s.charAt(j)) {
                countPalidrome--;
                if (countPalidrome == 0) {
                    result++;
                    break;
                }
            }
            countPalidrome = 1;
        }
        return result;
    }
}