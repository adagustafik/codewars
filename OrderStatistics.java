public class OrderStatistics {
    public static void main(String[] args) {
        // do order statistics lower than O(n*log(n)) times - sorting algo for Java
        System.out.println(findMin(new int[]{1,6,3,9,8,5}, 5)); // 2
        System.out.println(findMin(new int[]{2,5,6,10,11,3,15}, 3)); // 1
    }
    private static int findMin(int[] nums, int n) {
        int count = 0;
        for (int num : nums) {
            if (num < n) {
                count++;
            }
        }
        return count;
    }
}
