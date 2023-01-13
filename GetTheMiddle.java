public class GetTheMiddle {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
    }

    private static String getMiddle(String word) {
        return word.substring((int) Math.ceil(word.length() / 2.0) - 1, (int) Math.floor(word.length() / 2.0) + 1);
    }
}
