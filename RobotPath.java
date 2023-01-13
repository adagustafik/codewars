import java.util.Map;

public class RobotPath {
    public static void main(String[] args) {
        System.out.println(translatePath("^^vvvv>><<^v>>"));
        System.out.println(translatePath(""));
    }

    private static String translatePath(String path) {
        if (path.isEmpty()) {
            return "Paused";
        }
        StringBuilder sb = new StringBuilder();
        Map<Character, String> directions = Map.of('^', "up", 'v', "down", '>', "right", '<', "left");
        int count = 1;
        for (int i = 0; i < path.length(); i++) {
            if (i < path.length() - 1 && path.charAt(i) == path.charAt(i + 1)) {
                count++;
            } else {
                sb.append("Take ").append(count).append(count > 1 ? " steps " : " step ").append(directions.get(path.charAt(i))).append(i < path.length() - 1 ? "\n" : "");
                count = 1;
            }
        }
        return sb.toString();
    }
}
