public class BinarySearch {
//    Given an array of integers nums which are unique & sorted in ascending order, and an integer target, write a function to search target in nums.
//    If target exists, then return its index. Otherwise, return -1.
//    You must write an algorithm with O(log n) runtime complexity.

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{-1,0,3,5,9,12}, 9));
        System.out.println(binarySearch(new int[]{-1,0,3,5,9,12}, 2));
    }

    private static int binarySearch(int[] array, int target) {
        int first = 0, last = array.length -1;
        while ( first <= last) {
            int middle = (first + last)/ 2;
            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return -1;
    }
}
