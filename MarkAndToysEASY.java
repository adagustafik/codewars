import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarkAndToysEASY {
    public static void main(String[] args) {
        // List of prices + budget -> buy max quantity
        System.out.println(maximumToys(List.of(1,2,3,4), 7)); // 3
        System.out.println(maximumToys(List.of(1,12,5,111, 200, 1000, 10), 50)); // 4
    }

    private static int maximumToys(List<Integer> prices, int k) {
        // sort the list
        // sum the elements until the budget is reached
        ArrayList<Integer> pricesSorted = new ArrayList<>(prices);
        Collections.sort(pricesSorted);
        int countToys = 0;
        int sum = 0;
        for (Integer price : pricesSorted) {
            sum += price;
            if (sum <= k) {
                countToys++;
            } else {
                break;
            }
        }
        return countToys;
    }
}
