public class StringEndsWith {
    public static void main(String[] args) {
        System.out.println(solution("samurai", "ai"));
        System.out.println(solution("sumo", "omo"));
        System.out.println(solution("ninja", "ja"));
        System.out.println(solution("sensei", "i"));
        System.out.println(solution("samurai", "ra"));
    }

    private static boolean solution(String s1, String s2) {
        return s1.matches(".*" + s2); // does not work on special chars
        // return s1.endsWith(s2);
    }
}
