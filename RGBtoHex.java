public class RGBtoHex {
    public static void main(String[] args) {
        System.out.println(rgb(255,255,255)); // FFFFFF
        System.out.println(rgb(255,255,300)); // FFFFFF
        System.out.println(rgb(0,0,0)); // 000000
        System.out.println(rgb(1,2,3)); // 010203
        System.out.println(rgb(148,0,211)); // 9400D3
    }

    private static String rgb(int r, int g, int b) {
        return String.format("%02X%02X%02X", roundToHex(r), roundToHex(g), roundToHex(b));
    }

    private static int roundToHex(int i) {
        return i < 0 ? 0 : Math.min(i, 255);
    }
}
