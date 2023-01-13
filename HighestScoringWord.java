import java.util.Arrays;
import java.util.Comparator;

public class HighestScoringWord {
    public static void main(String[] args) {
//        Given a string of words, you need to find the highest scoring word.
//        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//        If two words score the same, return the word that appears earliest in the original string.
//        All letters will be lowercase and all inputs will be valid.

        System.out.println(countHighestScore("man i need a taxi up to ubud"));
        System.out.println(countHighestScore("what time are we climbing up to the volcano"));
        System.out.println(countHighestScore("take me to semynak"));
        System.out.println(countHighestScore("aa b"));
        System.out.println(countHighestScore("b aa"));
    }

    private static String countHighestScore(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(word -> word.chars().map(c -> c - 96).sum())).get();


//        var arr = s.split(" ");
//        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
//        for (String word : arr) {
//            int wordScore = word.chars().map(x -> Character.getNumericValue(x) - 9).sum();
//            map.put(word, wordScore);
//        }
////        return map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
//        return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }
}
