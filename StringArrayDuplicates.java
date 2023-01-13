import java.util.Arrays;

public class StringArrayDuplicates {
    public static void main(String[] args) {
//      remove all consecutive duplicate letters from each string in the array

        System.out.println(Arrays.toString(dup(new String[]{"abracadabra", "allottee", "assessee"})));
        System.out.println(Arrays.toString(dup(new String[]{"kelless","keenness"})));
    }

    private static String[] dup(String[] arr) {
       String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            StringBuilder word = new StringBuilder(String.valueOf(chars[0]));
            for (int j = 1; j < chars.length; j++) {
                word.append(chars[j] != chars[j - 1] ? String.valueOf(chars[j]) : "");
            }
            result[i] = word.toString();
        }
        return result;
    }
}
