import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MakingAnagramsEASY {
    public static void main(String[] args) {
        // return how many letters have to be deleted to make anagrams ->> hashmap letters and count -> return the count of % 2 == 1
        System.out.println(makeAnagram("cde", "dcf")); //2
        System.out.println(makeAnagram("cde", "abc")); //4
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke")); //30
    }

    private static int makeAnagram(String a, String b) {
        int count = 0;
        HashMap<String, Long> charsCountA = new HashMap<>(Arrays.stream(a.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        HashMap<String, Long> charsCountB = new HashMap<>(Arrays.stream(b.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        Iterator<Map.Entry<String, Long>> itA = charsCountA.entrySet().iterator();
        while (itA.hasNext()) {
            Map.Entry<String, Long> pair = itA.next();
            var key = pair.getKey();
            var value = pair.getValue();
            if (!charsCountB.containsKey(key)) {
                count += value;
                itA.remove();
            } else if (!Objects.equals(charsCountB.get(key), value)){
                count += Math.abs(charsCountB.get(key) - value);
                itA.remove();
                charsCountB.remove(key);
            }
        }
        for (Map.Entry<String, Long> pair : charsCountB.entrySet()) {
            var key = pair.getKey();
            var value = pair.getValue();
            if (!charsCountA.containsKey(key)) {
                count += value;
            } else if (!Objects.equals(charsCountA.get(key), value)) {
                count += Math.abs(charsCountA.get(key) - value);
            }
        }
        return count;
    }
}
