public class RootOfNumber {
    public static void main(String[] args) {
//         x & n are positive nums
        System.out.println(root(7, 3)); // 1.913
        System.out.println(root(9, 2)); // 3
        System.out.println(root(8, 3)); // 2
        System.out.println(root(0, 3)); // 2

    }
    private static double root(double x, int n) {
//        the n-th root of a number x is equal with the number x in the power of 1/n
//        return roundTo3Decimals(Math.pow(x, 1./n));
        double start = 0;
        double end = x;
        double error = 0.001;
        double mid = 0;
        double result = 0;

        while (Math.abs(result - x) >= error) {
            mid = (start + end) / 2;
            result = Math.pow(mid, n);

            if (result > x) {
                end = mid;
            } else if (result < x) {
                start = mid;
            }
        }
        return roundTo3Decimals(mid);
    }

    private static double roundTo3Decimals(double x) {
        int i = (int)((x + 0.0005) * 1000);
        return i/1000.;
    }
}
