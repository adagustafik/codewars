import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays2DEASY {
    private final static int array2DSize = 6;

    public static void main(String[] args) {
        //given a 6x6 2D array
        // print largest (max) hourglass sum found in arr
        System.out.println(hourglassSum(List.of(List.of(1,1,1,0,0,0), List.of(0,1,0,0,0,0), List.of(1,1,1,0,0,0), List.of(0,0,2,4,4,0), List.of(0,0,0,2,0,0), List.of(0,0,1,2,4,0)))); // 19
    }

    private static int hourglassSum(List<List<Integer>> arr) {
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < array2DSize - 2; i++) {
            for (int j = 1; j < array2DSize - 1; j++) {
                int count13 = arr.get(i).get(j-1) +  arr.get(i).get(j)+ arr.get(i).get(j + 1);
                int count2 = arr.get(i + 1).get(j);
                int count33 = arr.get(i + 2).get(j-1) +  arr.get(i + 2).get(j)+ arr.get(i + 2).get(j + 1);
                sums.add(i, count13 + count2 + count33);
            }
        }
        return Collections.max(sums);
    }
}
