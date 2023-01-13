public class Order {

    public static void main(String[] args) {
//        Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
//        Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//        If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
        System.out.println(order("is2 Thi1s T4est 3a"));
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.println(order(""));
    }

    public static String order(String words) {
        String[] singles = words.split(" ");
        StringBuilder ordered = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            for (String s : singles) {
                if (s.contains(String.valueOf(i))) {
                    ordered.append(s).append(" ");
                }
            }
        }
        return ordered.toString().trim();


//        String[] ordered = new String[singles.length];
//        for (String single : singles) {
//            for (int j = 0; j < single.length(); j++) {
//                if ((single.charAt(j) > 48) && (single.charAt(j) < 58)) {
//                    int n = single.charAt(j) - 49;
//                    ordered[n] = single;
//                }
//            }
//        }
//        return Arrays.toString(ordered).replaceAll( "[^ 0-9A-Za-z]","");
    }
}

