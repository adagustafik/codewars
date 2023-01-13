import java.util.Arrays;

public class PancakeSort {
    // sorting implemented via our flip function
    // [2 4 3 1 5] -> [2 4 3 1 5] -> []
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pancakeSort(new int[]{1, 5, 4, 3, 2})));
        System.out.println(Arrays.toString(pancakeSort(new int[]{2, 4, 3, 1, 5})));
    }
    static int[] pancakeSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int indexHighest = i;
            for (int j = i; j >= 0; j--) {
                if (arr[j] > arr[indexHighest]) {
                    indexHighest = j;
                }
            }
            flip(arr, indexHighest + 1);
            flip(arr, i + 1);
        }
        return arr;
    }
    // reverses the order of the first k elements in the array
    private static int[] flip(int[] arr, int k) {
        for (int i = 0; i < k / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[k - i - 1];
            arr[k - i - 1] = temp;
        }
        return arr;
    }
}
