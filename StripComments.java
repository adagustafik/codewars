public class StripComments {
    public static void main(String[] args) {
        System.out.println(stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"})); // "apples, pears\ngrapes\nbananas" -> # and bananas + !apples -> removed
    }

    private static String stripComments(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");
        for (int i = 0; i < lines.length; i++) {
            for (String symbol : commentSymbols) {
                int position = lines[i].indexOf(symbol);
                if (position >= 0) {
                    lines[i] = lines[i].substring(0, position);
                }
                lines[i] = lines[i].stripTrailing();
            }
        }
        return String.join("\n", lines);
    }
}
