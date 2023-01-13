public class HowManyReindeers {
    public static void main(String[] args) {
//      2 reindeers are always required for the sleigh and Santa himself.
//      Additionally he needs 1 reindeer per 30 presents.
//      As you know, Santa has 8 reindeers in total, so he can deliver up to 180 presents at once (2 reindeers for Santa and the sleigh + 6 reindeers with 30 presents each).

        System.out.println(reindeers(0));
        System.out.println(reindeers(1));
        System.out.println(reindeers(30));
        System.out.println(reindeers(200));
    }

    private static int reindeers(int presents) {
        if (presents > 180 || presents < 0) {
            throw new Error("Not enough reindeers for this job");
        }
        return (int)Math.ceil(presents/ 30f) + 2;
    }
}
