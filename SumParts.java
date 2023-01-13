import java.util.Arrays;

public class SumParts {
    public static void main(String[] args) {
//        The function sumParts will take as parameter an array ls and return an array of the sums of its parts as defined above.
//        Find a good performance solution as time is tested as well

        System.out.println(Arrays.toString(sumParts(new int[]{1, 2, 3, 4, 5, 6})));
    }

    private static int[] sumParts(int[] ls) {
        int[] sums = new int[ls.length + 1];
        int sum = Arrays.stream(ls).sum();
        for (int i = 0; i < ls.length; i++) {
            sums[i] = sum;
            sum -= ls[i];
        }
        return sums;
    }
}
