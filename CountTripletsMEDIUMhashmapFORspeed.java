import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTripletsMEDIUMhashmapFORspeed {
    public static void main(String[] args) {
        // find triplets of indices i < j < k
        // with elements in geometric progression for a given ratio r
        System.out.println(countTriplets(List.of(1L,4L,16L,64L), 4L)); // [1,4,16], [4,16,64] -> 2
        System.out.println(countTriplets(List.of(1L,2L,2L,4L), 2L)); // [1,2,4], [1,2,4] -> 2
        System.out.println(countTriplets(List.of(1L,3L,9L,9L,27L,81L), 3L)); // [1,3,9], [1,3,9], [3,9,27], [3,9,27], [9,27,81], [9,27,81] -> 6
        System.out.println(countTriplets(List.of(1L,5L,5L,25L,125L), 5L)); // [1,5,25], [1,5,25], [5,25,125], [5,25,125] -> 4
        System.out.println(countTriplets(List.of(1L,1L,1L,1L,1L,1L,1L,1L,1L,1L), 1L));
    }
    private static long countTriplets(List<Long> arr, long r) {
//  going backwards -> add 64,1 to mapFirstPair
//  if mapFirstPair contains current * r -> add to mapSecondPair current, + mapFirstPair.get(current * r)
//  add current,1 to mapFirstPair
//  myPair now contains newCurrent * r -> we have our first triplet
//  REPEAT till the beginning

        long numberOfTriplets = 0L;
        Map<Long, Long> mapFirstPair = new HashMap<>();
        Map<Long, Long> mapSecondPair = new HashMap<>();
        for (int i = arr.size() - 1; i >= 0; i--) {
            long current = arr.get(i);
            if (mapSecondPair.containsKey(current * r)) {
                numberOfTriplets += mapSecondPair.get(current * r);
            }
            if (mapFirstPair.containsKey(current * r)) {
                mapSecondPair.put(current, mapSecondPair.getOrDefault(current, 0L) + mapFirstPair.get(current * r));
            }
            mapFirstPair.put(current,mapFirstPair.getOrDefault(current, 0L) + 1);
        }
        return numberOfTriplets;
    }
}
