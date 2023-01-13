import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
//        Print the following  lines, each to  decimals:
//        proportion of positive values
//        proportion of negative values
//        proportion of zeros
//        0.500000
//        0.333333
//        0.166667

        plusMinus(List.of(-4,3,-9,0,4,1));
    }
    public static void plusMinus(List<Integer> arr) {
        var plus = arr.stream().filter(x -> x > 0).count();
        System.out.printf("%f%n",(float)plus/arr.size());
        var minus = arr.stream().filter(x -> x < 0).count();
        System.out.printf("%f%n",(float)minus/arr.size());
        var zero = arr.stream().filter(x -> x == 0).count();
        System.out.printf("%f%n",(float)zero/arr.size());
    }
}
