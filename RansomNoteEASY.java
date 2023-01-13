import java.util.ArrayList;
import java.util.List;

public class RansomNoteEASY {
    public static void main(String[] args) {
        // words can be used only whole and case-sensitive
        checkMagazine(new ArrayList<>(List.of("attack", "at", "dawn")),List.of("attack", "at", "dawn")); //YES
        checkMagazine(new ArrayList<>(List.of("give", "me", "one", "grand", "today", "night")),List.of("give", "one", "grand", "today")); //YES
        checkMagazine(new ArrayList<>(List.of("two", "times", "three", "is", "not", "four")),List.of("two", "times", "two", "is", "four")); //NO
    }

    private static void checkMagazine(List<String> magazine, List<String> note) {
        for (String s : note) {
            boolean found = false;
            for (int i = 0; i < magazine.size(); i++) {
                if (s.equals(magazine.get(i))){
                    magazine.remove(i);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
