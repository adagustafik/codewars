public class VowelCount {
    public static void main(String[] args) {
//        Return the number (count) of vowels in the given string.
//        We will consider a, e, i, o, u as vowels for this Kata (but not y).
//        The input string will only consist of lower case letters and/or spaces.
        System.out.println(getCount("abracadabra"));
        System.out.println(getCount("Andrea"));
    }

    public static int getCount(String str) {
//        return str.replaceAll("(?i)[^aeiou]", "").length();
        return (int)str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }
}