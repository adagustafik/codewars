public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:01:00PM"));
        System.out.println(timeConversion("12:01:00AM"));
        System.out.println(timeConversion("07:05:45PM"));
    }

    private static String timeConversion(String s) {
        boolean am = s.endsWith("AM");
        String[] s24 = s.substring(0,s.length() - 2).split(":");
        if (s24[0].equals("12") && am) {
            s24[0] = "00";
        }
        if (!am) {
            s24[0] = String.valueOf((Integer.parseInt(s24[0]) % 12) + 12);
        }
        return String.join(":", s24);
    }
}
