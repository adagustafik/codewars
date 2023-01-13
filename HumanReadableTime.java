public class HumanReadableTime {
    public static void main(String[] args) {
        System.out.println(makeReadable(4800)); //00:01:00
        System.out.println(makeReadable(86399)); //23:59:59
    }

    public static String makeReadable(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, seconds % 60);
    }
}
