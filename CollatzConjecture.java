import java.util.ArrayList;
import java.util.List;

public class CollatzConjecture {
    public static void main(String[] args) {
        System.out.println(solution(20L));
    }

    private static int solution(long num) {
        ArrayList<Long> list = new ArrayList<>(List.of(num));
        while (num > 1) {
            if (num % 2 == 0) {
                num = num / 2;
                list.add(num);
            } else {
                num = (num * 3) + 1;
                list.add(num);
            }
        }
        return list.size();
    }
}
