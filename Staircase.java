public class Staircase {
    public static void main(String[] args) {
       staircase(6);
    }
    private static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
