import java.util.*;

public class FraudulentActivityNotif {
    public static void main(String[] args) {
        // notifications are sent out if the amount spent on a day >= client's median spending for a trailing num of days
        // no notifications sent if there are no complete data for trailing num of days -> d
        // median value -> value separating higher & lower half of data (1,3,3,6,7,8,9) -> median 6, (1,2,3,4,5,6,8,9) -> median (4 + 5) / 2. -> 4.5
        System.out.println(activityNotifications(List.of(10,20,30,40,50), 3)); // 10,20,30 -> median 20 -> expenditure 40 => 2 * 20 -> notif++ -> 20,30,40 -> median 30 -> expenditure 50 >= 2 * 30 -> TOTAL NOTIF 1
        System.out.println(activityNotifications(List.of(2,3,4,2,3,6,8,4,5), 5)); // TOTAL NOTIF 2
        System.out.println(activityNotifications(List.of(1,2,3,4,4), 4)); // TOTAL NOTIF 0
    }

    private static int activityNotifications(List<Integer> expenditure, int d) {
        if (expenditure.size() <= d) {
            return 0;
        }
        int notificationCount = 0;
        SortedList<Integer> medianSubListSorted = new SortedList<>();
        for (int i = 0; i < d - 1; i++) {
            medianSubListSorted.add(expenditure.get(i));
        }
        for (int i = 0; i < expenditure.size() - d; i++) {
            int first = expenditure.get(i);
            medianSubListSorted.add(expenditure.get(i + d - 1));
            int medianSublistSize = medianSubListSorted.size();

            double medianDouble = medianSublistSize % 2 == 1 ? medianSubListSorted.get(((medianSublistSize + 1) / 2) - 1) * 2 :
                    medianSubListSorted.get(medianSublistSize / 2) + medianSubListSorted.get((medianSublistSize - 1) / 2);
            if (expenditure.get(i + d) >= medianDouble) {
                notificationCount++;
            }
            medianSubListSorted.remove(Integer.valueOf(first));
        }
        return notificationCount;
    }

    static class SortedList<T> extends ArrayList<T> {
        private final Comparator<? super T> comparator = Comparator.comparingInt((T o) -> (int) o);

        @Override
        public boolean add(T paramT) {
            int initialSize = this.size();
            int insertionPoint = Collections.binarySearch(this, paramT, comparator);
            super.add((insertionPoint > -1) ? insertionPoint : (-insertionPoint) - 1, paramT);
            return (this.size() != initialSize);
        }

        @SuppressWarnings("unchecked")
        @Override
        public boolean remove(Object paramT) {
            int initialSize = this.size();
            T ob = (T)paramT;
            int removePoint = Collections.binarySearch(this, ob, comparator);
            super.remove((removePoint > -1) ? removePoint : (-removePoint) - 1);
            return (this.size() != initialSize);
        }
    }
}
// create sublist for d
// sort
// get median -> odd number, middle -> even number, average of two middle values
// compare current value to median
//        if (expenditure.size() <= d) { return 0; }
//        int notificationCount = 0;
//        rrayList<Integer> medianSubList = new ArrayList<>(expenditure.subList(0, d - 1));
//        for (int i = 0; i < expenditure.size() - d; i++) {
//          int first = expenditure.get(i);
//          medianSubList.add(expenditure.get(i + d - 1));
//          Collections.sort(medianSubList);
//          double medianDouble = medianSubList.size() % 2 == 1 ? medianSubList.get(((medianSubList.size() + 1) / 2) - 1) * 2 :
//          medianSubList.get(medianSubList.size() / 2) + medianSubList.get((medianSubList.size() - 1) / 2);
//          if (expenditure.get(i + d) >= medianDouble) {
//              notificationCount++;
//          }
//          medianSubList.remove(Integer.valueOf(first));
//        }
//        return notificationCount;
