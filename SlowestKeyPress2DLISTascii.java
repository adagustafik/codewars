import java.util.List;

public class SlowestKeyPress2DLISTascii {
    public static void main(String[] args) {
        // element keyTimes[i][0] is encoded character in range ascii[a-z], where a = 0, b = 1... z = 25
        // element keyTimes[i][1] the time the key is pressed since the start of the test
        // -> first time 2 - 0 = 2
        // -> second time 5 - 2 = 3
        // -> third time 9 - 5 = 4
        // -> forth time 15 - 9 = 6 -> longest -> key 2 -> returns 'c'
        System.out.println(slowestKey(List.of(List.of(0,2),List.of(1,5),List.of(0,9), List.of(2,15))));

    }

    private static char slowestKey(List<List<Integer>> keyTimes) {
        int max = keyTimes.get(0).get(1);
        int c = keyTimes.get(0).get(0);
        for (int i = 1; i < keyTimes.size(); i++) {
            int time = keyTimes.get(i).get(1) - keyTimes.get(i - 1).get(1);
            if (time > max) {
                max = time;
                c = keyTimes.get(i).get(0);
            }
        }
        return (char) (c + 97);
    }
}
