import java.util.ArrayList;
import java.util.List;

public class LeftRotationEASY {
    public static void main(String[] args) {
//        EXPECTED RESULT 3,4,5,1,2
        System.out.println(rotateLeft(List.of(1, 2, 3, 4, 5), 2));
//        EXPECTED RESULT 5,1,2,3,4
        System.out.println(rotateLeft(List.of(1, 2, 3, 4, 5), 4));
    }

    private static List<Integer> rotateLeft(List<Integer> arr, int d) {
        ArrayList<Integer> shifted = new ArrayList<>(arr);
        for (int i = 0; i < d; i++) {
            int temp = shifted.get(0);
            shifted.remove(0);
            shifted.add(temp);
        }
        return shifted;
    }
}
