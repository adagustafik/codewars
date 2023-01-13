import java.util.HashSet;

public class GetADifferentNumber {
    public static void main(String[] args) {
    // given an arr of unique nonnegative integers -> find the smallest nonnegative intefer NOT in the array
        System.out.println(getDifferentNumber(new int[]{0, 1, 2, 3})); // returns 4
        System.out.println(getDifferentNumber(new int[]{0, 2, 3})); // returns 4
        System.out.println(getDifferentNumberBetter(new int[]{0, 1, 2, 3})); // returns 4
        System.out.println(getDifferentNumberBetter(new int[]{0, 2, 3})); // returns 4
    }
    // better time/space complexity modifying an arr
    // using hashmap for constant lookup time
    private static int getDifferentNumberBetter(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) {
                result = i;
                break;
            }
        }
        return result;
    }

    // solve it first not being able to modify the array -> O(n2)
    private static int getDifferentNumber(int[] arr) {
        int result = -1;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            boolean found = false;
            for (int k : arr) {
                if (k == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result = i;
                break;
            }
        }
        return result;
    }
}
