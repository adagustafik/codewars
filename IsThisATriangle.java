import java.util.Arrays;

public class IsThisATriangle {
    public static void main(String[] args) {
        //    Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can be built with the sides of given length and false in any other case.
        System.out.println(isTriangle(1,2,2)); // true
        System.out.println(isTriangle(7,2,2)); // false
    }

    private static boolean isTriangle(int a, int b, int c) {
        int[] arr = {a, b ,c};
        Arrays.sort(arr);
        return arr[0] + arr[1] > arr[2];
    }
}
