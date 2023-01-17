import java.util.ArrayList;

public class BishopsMovement {
    public static void main(String[] args) {
        System.out.println(bishop("a1", "b4", 2)); // true
        System.out.println(bishop("a1", "b5", 2)); // false
        System.out.println(bishop("e6", "a1", 2)); // false
        System.out.println(bishop("a8", "h7", 0)); // false
        System.out.println(bishop("c4", "h1", 1)); // false
    }

    private static boolean bishop(String posStart, String posEnd, int n) {
        if (posStart.equals(posEnd)) {
            return true; // same position
        }
        if (n == 0) {
            return false; // not enough moves
        }
        ArrayList<String> blacks = new ArrayList<>();
        ArrayList<String> whites = new ArrayList<>();
        int[] posStartDec = {(int) posStart.charAt(0) - 97, (int) posStart.charAt(1) - 49};
        ArrayList<String> diagonals = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((j + i) % 2 == 1) {
                    blacks.add(Character.toString(97 + i) + (1 + j));
                } else {
                    whites.add(Character.toString(97 + i) + (1 + j));
                }
                if (i == j) {
                    if ((i + posStartDec[0] % 8) < 8 && (1 + (j + posStartDec[1]) < 9)) {
                        diagonals.add(Character.toString(97 + (i + posStartDec[0]) % 8) + (1 + ((posStartDec[0] + i < 8) ? (posStartDec[1] - j) : (posStartDec[1] - j + 8))));
                    }
                }
            }
        }
        if (blacks.contains(posStart) && !blacks.contains(posEnd)) {
            return false;
        }
        if (whites.contains(posStart) && !whites.contains(posEnd)) {
            return false;
        }
        if (n > 1) {
            return true;
        } else {
            return diagonals.contains(posEnd);
        }
    }
}
