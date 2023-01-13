public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 0));
    }

    private static int searchInsert(int[] nums, int target) {
        int first = 0, last = nums.length -1;
        while ( first <= last) {
            int middle = (first + last)/ 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return first;
//        int indexToBe = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target){
//                return i;
//            }
//            if (nums[i] < target) {
//                indexToBe++;
//            }
//        }
//        return indexToBe;
    }
}
