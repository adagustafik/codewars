import java.util.Arrays;

public class AreSame {
    public static void main(String[] args) {
//        array b multiplies array a? -> any order

        System.out.println(comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
    }

    private static boolean comp(int[] a, int[] b) {
//        if (Objects.isNull(a) || Objects.isNull(b)) {
//            return false;
//        }
//        if (a.length == 0 && b.length == 0) {
//            return true;
//        }
//        if (a.length == 0 || b.length == 0) {
//            return false;
//        }
//        List<Integer> listB = Arrays.stream(b).boxed().toList();
//        ArrayList<Integer> listBmodified = new ArrayList<>(listB);
//
//        for (int i : a) {
//            int square = i * i;
//            if (!listBmodified.contains(square)) {
//                return false;
//            } else {
//                listBmodified.remove((Integer) square);
//            }
//        }
        return a != null && b != null && a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(), Arrays.stream(b).sorted().toArray());
    }
}
