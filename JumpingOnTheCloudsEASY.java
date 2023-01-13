import java.util.List;

public class JumpingOnTheCloudsEASY {

    // player can jump +1/ +2
    // player can jump only on clouds with value 0
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(List.of(0,1,0,0,0,1,0))); // 3
        System.out.println(jumpingOnClouds(List.of(0,0,1,0,0,1,0))); // 4
        System.out.println(jumpingOnClouds(List.of(0,0,0,1,0,0))); // 3
        System.out.println(jumpingOnClouds(List.of(0,0))); // 1
    }

    private static int jumpingOnClouds(List<Integer> c) {
        if (c.size() == 2) {
            return 1;
        }
        int count = 0;
        for (int i = 2; i < c.size(); i++) {
            if (c.get(i) == 0) {
                i += 1;
            }
            count += 1;
            if (i == c.size() - 1) {
                count += 1;
            }
        }
        return count;
    }
}
