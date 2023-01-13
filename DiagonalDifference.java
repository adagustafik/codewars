import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {

//        Sum left-to-right diagonal. Sum right to left diagonal. Return their absolute difference.

        System.out.println(diagonalDifference(new int[][]{{11,2,4}, {4,5,6},{10,8,-12}}));
        //        System.out.println(diagonalDifference(3, List.of(List.of(1,2,3), List.of(4,5,6), List.of(9,8,9))));
    }

    private static int diagonalDifference(int[][] arr) {
        int l = arr.length;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (i == j) {
                    sum1 += arr[i][j];
                    sum2 += arr[i][l - j - 1];
                }
            }
        }
        return Math.abs(sum1-sum2);
    }

//    private static int diagonalDifference(int l, List<List<Integer>>arr) {
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < l; i++) {
//            for (int j = 0; j < l; j++) {
//                if (i == j) {
//                    var x1 = arr.get(i);
//                    sum1 += x1.get(j);
//                    sum2 += x1.get(l - j - 1);
//                }
//            }
//        }
//        return Math.abs(sum1-sum2);
//    }
}
