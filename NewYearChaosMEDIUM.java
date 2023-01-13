import java.util.ArrayList;
import java.util.List;

public class NewYearChaosMEDIUM {
    // a number can move only 2 places from their original position -> count the swaps
    public static void main(String[] args) {
        minimumBribes(new ArrayList<>(List.of(1,2,3,5,4,6,7,8))); //1
        minimumBribes(new ArrayList<>(List.of(4,1,2,3))); //Too chaotic
        minimumBribes(new ArrayList<>(List.of(2,1,5,3,4))); //3
        minimumBribes(new ArrayList<>(List.of(2,5,1,3,4))); //Too chaotic
        minimumBribes(new ArrayList<>(List.of(1,2,5,3,7,8,6,4))); //7
    }
    private static void minimumBribes(List<Integer> q) {
        int swaps = 0;
        // Bubble sort implementation
        boolean isSorted = false;
        int lastUnsorted = q.size() -1;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (q.get(i) - i - 1 > 2) {
                    swaps = -1;
                    break;
                }
                var geti = q.get(i);
                var geti1 = q.get(i + 1);
                if (geti > geti1) {
                    q.set(i, geti1);
                    q.set(i + 1, geti);
                    swaps++;
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
        System.out.println(swaps > 0 ? swaps : "Too chaotic");
    }
}
