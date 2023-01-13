import java.util.Arrays;

public class MinimumSum {
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }

    private static int minimumSum(int num) {
        var r = Arrays.stream(String.valueOf(num).split("")).sorted().toList();
        int new1 = Integer.parseInt(r.get(0) + r.get(2));
        int new2 = Integer.parseInt(r.get(1) + r.get(3));
        return new1 + new2;
    }
}
