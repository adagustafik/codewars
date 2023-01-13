public class StrongPassword {
    public static void main(String[] args) {
//        Password length at least 6 chars, constraints: 1 digit, 1 lowercase, 1 uppercase, 1 special char from this group: !@#$%^&*()-+
//        Returns the minimum number of characters to add to fullfill above

        System.out.println(minimumNumber(5,"2bbbb")); // 2
        System.out.println(minimumNumber(5,"2bb#A")); // 1
        System.out.println(minimumNumber(3,"Ab1")); // 3
        System.out.println(minimumNumber(11,"#HackerRank")); // 1
    }
    private static int minimumNumber(int length, String s) {
        int lengthDiff = 6 - length;
        int lengthReq = Math.max(lengthDiff, 0);
        int requirements = 0;
        if (s.matches("[^0-9]+")) {
            requirements++;
        }
        if (s.matches("[^A-Z]+")) {
            requirements++;
        }
        if (s.matches("[^a-z]+")) {
            requirements++;
        }
        if (s.matches("[^!@#$%^&*()\\-+]+")) {
            requirements++;
        }
        return Math.max(lengthReq, requirements);
    }
}
