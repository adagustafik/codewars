import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {
    public static void main(String[] args) {
        // return the number of unordered anagrammatic pairs of substrings in s
        System.out.println(sherlockAndAnagrams("mom")); // -> [m,m], [mo,om] -> 2
        System.out.println(sherlockAndAnagrams("abba")); // -> [a,a], [ab,ba], [b,b], [abb, bba] -> 4
        System.out.println(sherlockAndAnagrams("abcd")); // -> 0
        System.out.println(sherlockAndAnagrams("ifailuhkqq")); // -> [i,i], [q,q], [ifa,fai] -> 3
        System.out.println(sherlockAndAnagrams("kkkk")); // -> [k,k] -> 6 times positions [0,1],[0,2],[0,3],[1,2],[1,3],[2,3] -> [kk,kk] -> 3 times, [kkk,kkk] -> altogether 10
        System.out.println(sherlockAndAnagrams("cdcd")); // -> [c,c], [d,d], [cd,dc], [cd,cd], [dc,cd] -> 5
    }

    private static int sherlockAndAnagrams(String s) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int start = 0; start < s.length(); start++) {
            for (int end = start + 1; end <= s.length(); end++) {
                char[] arr = s.substring(start, end).toCharArray();
                Arrays.sort(arr);
                String str = new String(arr);
                if (map.containsKey(str)) {
                    count += map.get(str);
                    map.put(str, map.get(str) + 1);
                } else {
                    map.put(str, 1);
                }
            }
        }
        return count;
    }
}
