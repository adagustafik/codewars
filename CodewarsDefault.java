import java.util.Arrays;

public class CodewarsDefault {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(function(348597)));
        System.out.println(Arrays.toString(function(0)));
        System.out.println(Arrays.toString(function(35231)));
    }
    public static int[] function(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
//        String s = Long.toString(n);
//        var array = s.chars().boxed().map(x -> x - 48).mapToInt(Integer::intValue).toArray();
//        int[] inverseArray = new int[array.length];
//        for (int j = array.length - 1, i = 0; j >= 0; j--, i++) {
//            inverseArray[i] = array[j];
//        }
//        return inverseArray;
    }
}
