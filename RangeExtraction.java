public class RangeExtraction {
    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[]{-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})); // # returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
        System.out.println(rangeExtraction(new int[]{3, 6, 9, 11, 12, 15, 17, 20, 21})); // # returns "3,6,9,11,12,15,17,20,21"
    }

    private static String rangeExtraction(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        int count = 1;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] == arr[i] - 1 && arr[i] == arr[i + 1] - 1) {
                count++;
            } else {
                sb.append(count > 1 ? "-" : ",").append(arr[i]);
                count = 1;
            }
        }
        sb.append((arr[arr.length - 2] == arr[arr.length - 1] -1 && arr[arr.length - 3] == arr[arr.length - 2] - 1) ? "-" : ",").append(arr[arr.length - 1]);
        return sb.toString();
    }
}
