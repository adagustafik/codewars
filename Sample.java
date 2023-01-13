import java.util.function.Supplier;

public class Sample {
    public static void main(String[] args) {
        Supplier<String> message = () -> "Java";
        Supplier<Integer> number = () -> 01;

        System.out.println("Message: " + message.get() + " Number: " + number.get());
    }
}
