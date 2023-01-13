public class SecureTester {
    public static void main(String[] args) {
        System.out.println(alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
    }

    private static boolean alphanumeric(String s) {
        return s.matches("[a-zA-Z0-9]+");
    }
}
