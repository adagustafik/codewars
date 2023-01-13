import java.util.List;

public class PaginationHelper<I> {
    List<I> collection;
    int itemsPerPage;
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }
    public int itemCount() {
        return collection.size();
    }
    public int pageCount() {
        return (collection.size() / itemsPerPage) + (leftOver() != 0 ? 1 : 0);
    }
    public int pageItemCount(int pageIndex) {
        int pageCount = pageCount();
        int leftOver = leftOver();
        return pageIndex + 1 > pageCount ? -1 : pageIndex + 1 == pageCount && leftOver != 0 ? leftOver : itemsPerPage ;
    }
    public int pageIndex(int itemIndex) {
        if (collection.size() == 0 || itemIndex < 0 || itemIndex >= collection.size()) {
            return -1;
        }
        return itemIndex / itemsPerPage;
    }
    public int leftOver() {
        return collection.size() % itemsPerPage;
    }
}
