import java.util.*;

public class CrashingStonesPRIORITYQUEUE {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(List.of(1,2,3,6,7,7))); // --> 0
        System.out.println(lastStoneWeight(List.of(2,4,5))); // --> 1
    }

    private static int lastStoneWeight(List<Integer> weights) {
//        ArrayList<Integer> pile = new ArrayList<>(weights);
//        while (pile.size() > 1) {
//            int max = Collections.max(pile);
//            pile.remove(Integer.valueOf(max));
//            int secondMax = Collections.max(pile);
//            pile.remove(Integer.valueOf(secondMax));
//            if (max - secondMax > 0) {
//                pile.add(max - secondMax);
//            }
//        }
//        return pile.size() > 0 ? pile.get(0) : 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int n : weights) {
            pq.offer(n);
        }

        while(pq.size() > 1) {
            int max = pq.poll();
            int secondMax = pq.poll();

            if (max > secondMax) {
                pq.offer(max - secondMax);
            }
        }
        return pq.size() > 0 ? pq.poll() : 0;
    }
}