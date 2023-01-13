import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumSumQueue {

//    You are given a positive integer num consisting of exactly four digits.
//    Split num into two new integers new1 and new2 by using the digits found in num.
//    Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
//    For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
//    Return the minimum possible sum of new1 and new2.

    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }
    private static int minimumSum(int num) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        while (num > 0) {
            queue.add(num % 10);
            num /= 10;
        }
        int min1 = queue.poll(), min2 = queue.poll();
        return (min1 * 10 + queue.poll()) + (min2 * 10 + queue.poll());

//        var r = Arrays.stream(String.valueOf(num).split("")).sorted().toList();
//        int new1 = Integer.parseInt(r.get(0) + r.get(2));
//        int new2 = Integer.parseInt(r.get(1) + r.get(3));
//        return new1 + new2;
    }
}
