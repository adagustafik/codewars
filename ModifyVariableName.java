public class ModifyVariableName {
    public static void main(String[] args) {
        System.out.println(modifyVariableName("modify_variableName")); // -> returns modifyVariableName
        System.out.println(modifyVariableName("thisIsAVariable")); // -> returns this_is_a_variable
    }

    private static String modifyVariableName(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.contains("_")) {
            int index = s.indexOf('_');
            sb.append(s, 0, index).append(Character.toUpperCase(s.charAt(index + 1))).append(s. substring(index + 2));
        } else {
            sb.append(s, 0, 1);
            for (int i = 0; i < s.length() - 1; i++) {
                char c = s.charAt(i + 1);
                if (c > 64 && c < 91) {
                    sb.append('_').append(Character.toLowerCase(c));
                } else {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
