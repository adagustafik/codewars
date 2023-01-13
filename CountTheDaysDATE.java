import java.util.Date;

public class CountTheDaysDATE {

    public static void main(String[] args) {

        Date eventPast = new Date(232322323200L);
        Date eventNow = new Date();
        Date eventFuture = new Date(2323223232000L);
        System.out.println(countDays(eventPast));
        System.out.println(countDays(eventNow));
        System.out.println(countDays(eventFuture));
    }

    private static String countDays(Date d) {
        Date now = new Date();
        int numDays = (int)((d.getTime() - now.getTime()) / (24*60*60*1000));
        //        TimeUnit.DAYS.convert(d.getTime() - now.getTime(), TimeUnit.MILLISECONDS)
        return numDays == 0 ? "Today is the day!" : numDays < 0 ? "The day is in the past!" : numDays + " days";
    }
}
