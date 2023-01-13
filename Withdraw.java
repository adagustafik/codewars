import java.util.Arrays;

public class Withdraw {
    public static void main(String[] args) {
//        An ATM ran out of 10 dollar bills and only has 100, 50 and 20 dollar bills.
//        For n = 250, the result should be [2, 1, 0].
//        For n = 260, the result should be [2, 0, 3].
//        For n = 370, the result should be [3, 1, 1].
//        For n = 230, the result should be [1, 1, 4].
//        For n = 40, the result should be [0, 0, 2].

        System.out.println(Arrays.toString(withdraw(250)));
        System.out.println(Arrays.toString(withdraw(260)));
        System.out.println(Arrays.toString(withdraw(370)));
        System.out.println(Arrays.toString(withdraw(230)));
        System.out.println(Arrays.toString(withdraw(40)));
    }

    private static int[] withdraw(int n) {
        int[] banknotes = new int[3];
        int belowHundred = 0;
        if (n % 100 == 10 || n % 100 == 30) {
            banknotes[0] = n / 100 - 1;
            belowHundred = n - banknotes[0] * 100;
            banknotes[1] = belowHundred / 50 - 1;
            banknotes[2] = (belowHundred - banknotes[1] * 50) / 20;
        } else {
            banknotes[0] = n /100;
            belowHundred = n - banknotes[0] * 100;
            if (belowHundred % 20 == 0) {
                banknotes[1] = 0;
                banknotes[2] = belowHundred / 20;
            } else {
                banknotes[1] = belowHundred / 50;
                banknotes[2] = (belowHundred - banknotes[1] * 50) / 20;
            }
        }
        return banknotes;
    }
}
