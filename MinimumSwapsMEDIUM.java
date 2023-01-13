public class MinimumSwapsMEDIUM {
    public static void main(String[] args) {
        // an array of consecutive integers without duplicated
        // find minimum number of swaps required
        System.out.println(minimumSwaps(new int[]{7,1,3,2,4,5,6})); // 5
        System.out.println(minimumSwaps(new int[]{4,3,1,2})); // 3
        System.out.println(minimumSwaps(new int[]{2,3,4,1,5})); // 3
        System.out.println(minimumSwaps(new int[]{1,3,5,2,4,6,7})); // 3
    }

    private static int minimumSwaps(int[] arr) {
        // check current element if not in correct place
        // than replace with element that should be in this place
        int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != i + 1) {
                    for (int j = 0; j < arr.length; j++) {
                        if (i + 1 == arr[j]){
                            arr[j] = arr[i];
                            arr[i] = i + 1;
                            count++;
                            break;
                        }
                    }
                }
            }
        return count;
    }
}
