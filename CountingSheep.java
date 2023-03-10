import java.util.Arrays;
import java.util.Objects;

public class CountingSheep {
    public static void main(String[] args) {
        System.out.println(countSheep(new Boolean[]{}));
        System.out.println(countSheep(null));
        System.out.println(countSheep(new Boolean[]
                {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true}));
    }
    public static int countSheep(Boolean[] sheep) {
        return Objects.isNull(sheep) ? 0 : (int)Arrays.stream(sheep)
                .filter(Boolean::booleanValue).count();
    }
}