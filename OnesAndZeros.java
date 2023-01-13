import java.util.List;
import java.util.stream.Collectors;

public class OnesAndZeros {
    public static void main(String[] args) {
        System.out.println(convertBinaryArrayToInt(List.of(0,0,1,0))); // 2
        System.out.println(convertBinaryArrayToInt(List.of(0,1,0,1))); // 5
    }

    private static int convertBinaryArrayToInt(List<Integer> binary) {
        return Integer.parseInt(binary.stream().map(String::valueOf).collect(Collectors.joining()),2);
    }
}
