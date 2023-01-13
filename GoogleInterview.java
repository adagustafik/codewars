import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GoogleInterview {

    public static void main(String[] args) {
        // sample output ("11:30","12:00"),("15:00","16:00"),("18:00","18:30")
        System.out.println(calendarOverlap(List.of(List.of("9:00","10:30"), List.of("12:00", "13:00"), List.of("16:00", "18:00")), List.of("9:00", "20:00"),
                List.of(List.of("10:00","11:30"), List.of("12:30", "14:30"), List.of("14:30", "15:00"), List.of("16:00", "17:00")), List.of("10:00", "18:30"), 30));
    }

    private static List<List<String>> calendarOverlap(List<List<String>> mtgs1, List<String> bound1, List<List<String>> mtgs2, List<String> bound2, int mins) {
        var free1 = spareTimes(mtgs1, bound1);
        var free2 = spareTimes(mtgs2, bound2);

        ArrayList<ArrayList<Double>> intersection = new ArrayList<>();
        intersection.addAll(getIntersection(free1, free2, mins));
        intersection.addAll(getIntersection(free2, free1, mins));
        intersection.sort(comparator);

        return convertToString(intersection);
    }
    public static List<List<String>> convertToString(ArrayList<ArrayList<Double>> doubles) {
        List<List<String>> result = new ArrayList<>();
        for (List<Double> list : doubles) {
            result.add(list.stream().map(x -> Math.floor(x) + (x % Math.floor(x)) * 6/10).map(x -> String.valueOf(x).replace(".", ":") + "0").toList());
        }
        return result;
    }

    public static Comparator<List<Double>> comparator = new Comparator<List<Double>>() {
        @Override
        public int compare(List<Double> o1, List<Double> o2) {
            return o1.get(0) > o2.get(0) ? 1 : -1;
        }
    };

    public static ArrayList<ArrayList<Double>> getIntersection(List<List<Double>> free1, List<List<Double>> free2, int mins) {
        ArrayList<ArrayList<Double>> intersection = new ArrayList<>();
        for (int i = 0; i < free1.size(); i++) {
            var free1Start = free1.get(i).get(0);
            var free1End = free1.get(i).get(1);
            var free2Start = free2.get(i).get(0);
            var free2End = free2.get(i).get(1);
            var soonerEnd = free1End < free2End ? free1End : free2End;
            if (free1Start > free2Start && free1Start < free2End && soonerEnd - free1Start >= mins/60.) {
                ArrayList<Double> arr = new ArrayList<>();
                arr.add(free1Start);
                arr.add(soonerEnd);
                intersection.add(arr);
            }
        }
        return intersection;
    }
    public static List<List<Double>> spareTimes(List<List<String>> mtgs, List<String> bound) {
        List<List<Double>> spares = new ArrayList<>();
        var mtgsStart = convertTime(mtgs.get(0).get(0));
        var boundStart = convertTime(bound.get(0));
        if (boundStart < mtgsStart) {
            spares.add(List.of(boundStart, mtgsStart));
        }
        for (int i = 1; i < mtgs.size(); i++) {
            var mtg1End = convertTime(mtgs.get(i - 1).get(1));
            var mtg2Start = convertTime(mtgs.get(i).get(0));
            if (!mtg1End.equals(mtg2Start)) {
                spares.add(List.of(mtg1End, mtg2Start));
            }
        }
        var mtgsEnd = convertTime(mtgs.get(mtgs.size() - 1) .get(1));
        var boundEnd = convertTime(bound.get(1));
        if (boundEnd > mtgsEnd) {
            spares.add(List.of(mtgsEnd, boundEnd));
        }
        System.out.println(spares);
        return spares;
    }
    public static Double convertTime(String s) {
        var d = Double.valueOf(s.replace(":", "."));
        var whole = Math.floor(d);
        var residue = d % whole;
        var r  = (int)Math.round((whole + 10 * residue / 6) * 100);
        return (double) r / 100;
    }
}
