import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays2DEASY {
    private final static int array2DSize = 6;

    public static void main(String[] args) {
        //given a 6x6 2D array
        // print largest (max) hourglass 3x3 sum found in arr
//        111000
//        010000
//        111000
//        002440
//        000200
//        001240
        System.out.println(hourglassSum(List.of(List.of(1,1,1,0,0,0), List.of(0,1,0,0,0,0), List.of(1,1,1,0,0,0), List.of(0,0,2,4,4,0), List.of(0,0,0,2,0,0), List.of(0,0,1,2,4,0)))); // 19
    }

    private static int hourglassSum(List<List<Integer>> arr) {
        ArrayList<Integer> sums = new ArrayList<>();
        for (int y = 0; y < array2DSize - 2; y++) {
            for (int x = 1; x < array2DSize - 1; x++) {
                int count13 = arr.get(y).get(x-1) +  arr.get(y).get(x)+ arr.get(y).get(x + 1);
                int count2 = arr.get(y + 1).get(x);
                int count33 = arr.get(y + 2).get(x-1) +  arr.get(y + 2).get(x)+ arr.get(y + 2).get(x + 1);
                sums.add(y, count13 + count2 + count33);
            }
        }
        return Collections.max(sums);
    }
}
