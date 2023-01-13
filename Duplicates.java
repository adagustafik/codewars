import java.util.*;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
//        If duplicate characters are found in the same array, the first occurance should be kept.
//        Whenever two keys share the same character, they should be compared numerically, and the larger key will keep that character.

        System.out.println(removeDuplicateIds(Map.of(1, List.of("A", "B", "C"), 2, List.of("A", "B", "D", "A")))); // return { "1": [C], "2": ["A", "B", "D"] }
        System.out.println(removeDuplicateIds(Map.of(1, List.of("A"), 2, List.of("A"), 3, List.of("A")))); // returns   { "1": [], "2": [], "3": ["A"] }
        System.out.println(removeDuplicateIds(Map.of(432, List.of("A", "A", "B", "D"), 53, List.of("L", "G", "B", "C"), 236,
                List.of("L", "A", "X", "G", "H", "X" ), 11, List.of("P", "R", "S", "D")))); // returns   { "432": ["A", "B", "D"], "53": ["C"], "236": ["L", "X", "G", "H"], "11", ["P", "R", "S"] }
    }

    private static Map<Integer, List<String>> removeDuplicateIds(Map<Integer, List<String>> obj) {
        var seen = new HashSet<>();
        return obj.entrySet().stream()
                .sorted(Map.Entry.<Integer, List<String>>comparingByKey().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        e -> e.getValue().stream().filter(seen::add).toList()
                ));

//        HashMap<Integer, List<String>> map = new HashMap<>(obj);
//        var keys = map.keySet().stream().mapToInt(Integer::intValue).toArray();
//        for (int i = 0; i < keys.length; i++) {
//            int key = keys[i];
//            ArrayList<String> list = new ArrayList<>(map.get(key));
//            map.replace(key, list.stream().distinct().toList());
//            for (int j = i + 1; j < keys.length; j++) {
//                int toBeRemovedKey = Math.min(key, keys[j]);
//                int removalsKey = Math.max(key, keys[j]);
//                ArrayList<String> toBeRemovedList = new ArrayList<>(map.get(toBeRemovedKey));
//                ArrayList<String> removals = new ArrayList<>(map.get(removalsKey));
//                toBeRemovedList.removeAll(removals);
//                map.replace(toBeRemovedKey, toBeRemovedList);
//            }
//        }
//        return map;
    }
}
