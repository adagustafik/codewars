import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SortingComparatorMEDIUM {
    public static void main(String[] args) {
        // Player {String name; int score}
        // an array of players -> sort in desc orded by score, if score is the same sort alphabetically asc
        // Checker class implements Comparator interface + write int compare(Player a, Player b)
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (s.matches("^((?i)[a-z]+([ 0-9]+))$")) {
                players.add(new Player(s.replaceAll("(?i)[^a-z]", ""), Integer.parseInt(s.replaceAll("[^0-9]", ""))));
            }
        }
        scanner.close();
        players.sort(new Checker());
        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
    }

    public static class Checker implements Comparator<Player>{
        public Checker() {
        }
        @Override
        public int compare(Player a, Player b) {
            return a.score < b.score ? 1 : a.score > b.score ? -1 : a.name.compareTo(b.name);
        }
    }

    public static class Player {
        String name;
        int score;
        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
}
