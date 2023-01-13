public class CountBits {
    public static void main(String[] args) {
        System.out.println(countBits(1234)); // 10011010010 => 5
    }

    private static int countBits(int n) {
        return (int)Integer.toBinaryString(n).chars().filter(c -> c == '1').count();
    }
}
