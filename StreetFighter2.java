import java.util.ArrayList;
import java.util.Arrays;

public class StreetFighter2 {
    public static void main(String[] args) {
//        INPUT
//        the list of game characters in a 2x6 grid;
//        the initial position of the selection cursor (top-left is (0,0));
//        a list of moves of the selection cursor (which are up, down, left, right);
//        OUTPUT
//        the list of characters who have been hovered by the selection cursor after all the moves (ordered and with repetition, all the ones after a move, whether successful or not, see tests);

        String[][] fighters = new String[][]{
                new String[] { "Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega" },
                new String[] { "Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison" },
        };
        String[] moves = new String[] { "up", "left", "right", "left", "left" };
        System.out.println(Arrays.toString(streetFighterSelection(fighters, new int[]{0,0}, moves)));
    }
    public static String[] streetFighterSelection(String[][] fighters, int[] p, String[] moves){
        return Arrays.stream(moves)
                .reduce(new ArrayList<String>(), (visited, n) -> {
                    p[0] = n == "down" ? 1 : 0;
                    p[1] = ((p[1] + (n == "right" ? 1 : n == "left" ? -1 : 0)) + fighters[0].length) % fighters[0].length;
                    visited.add(fighters[p[0]][p[1]]);
                    return visited;
                }, (acc, n) -> acc)
                .toArray(String[]::new);

//        ArrayList<String> visited = new ArrayList<>();
//        for (String move : moves) {
//            int[] newPosition = moveCursor(position, move);
//            visited.add(fighters[newPosition[0]][newPosition[1]]);
//        }
//        return visited.toArray(String[]::new);
//    }
//    public static int[] moveCursor(int[] position, String move){
//        switch (move) {
//            case "right" -> position[1] = position[1] < 5 ? position[1] + 1 : 0;
//            case "left" -> position[1] = position[1] > 0 ? position[1] - 1 : 5;
//            default -> position[0] = move.equals("down") ? 1 : 0;
//        }
//        return position;
    }
}
