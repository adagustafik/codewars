public class ComplementaryDNA {
    public static void main(String[] args) {
        //dnaStrand []        `shouldBe` []
        //dnaStrand [A,T,G,C] `shouldBe` [T,A,C,G]
        //dnaStrand [G,T,A,T] `shouldBe` [C,A,T,A]
        //dnaStrand [A,A,A,A] `shouldBe` [T,T,T,T]

        System.out.println(makeComplement("TTTT"));
        System.out.println(makeComplement("TAACG"));
    }
    public static String makeComplement(String s) {
      char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = getComplement(chars[i]);
        }
        return new String(chars);
    }
    private static char getComplement (char c) {
        return switch (c) {
            case 'A' -> 'T';
            case 'T' -> 'A';
            case 'C' -> 'G';
            case 'G' -> 'C';
            default -> c;
        };
    }
}
