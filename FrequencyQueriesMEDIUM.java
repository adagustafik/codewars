import java.util.*;

public class FrequencyQueriesMEDIUM {
    public static void main(String[] args) {
        // queries[i][0] -> operation -> 1 insert data -> 2 delete -> 3 check if an integer is present with this data frequency -> if yes, print 1 else 0
        // queries[i][1] -> data
        System.out.println(freqQuery(List.of(List.of(1,1), List.of(2,2), List.of(3,2), List.of(1,1), List.of(1,1), List.of(2,1), List.of(3,2)))); // prints 0,1  + [1,1]
        System.out.println(freqQuery(List.of(List.of(1,5), List.of(1,6), List.of(3,2), List.of(1,10), List.of(1,10), List.of(1,6), List.of(2,5), List.of(3,2)))); // prints 0,1 + [6,10,10,6]
    }

    private static List<Integer> freqQuery(List<List<Integer>> queries) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Integer> counts = new HashMap<>();
        int counter = 0;
        for (List<Integer> query: queries) {
            Integer d = query.get(1);
            switch (query.get(0)) {
                case 1:
                    counts.put(d, counts.getOrDefault(d, 0) + 1);
                    counter++;
                    break;
                case 2:
                    if (counts.containsKey(d)) {
                        Integer count = counts.get(d);
                        if (count > 1) {
                            counts.put(d, count - 1);
                        } else {
                            counts.remove(d);
                        }
                        counter--;
                    }
                    break;
                case 3:
                    if (counter < d) {
                        output.add(0);
                    } else {
                        output.add(counts.containsValue(d)? 1 : 0);
                    }
                    break;
            }
        }
        return output;
    }
}
