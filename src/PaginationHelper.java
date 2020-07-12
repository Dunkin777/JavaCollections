import java.util.Arrays;
import java.util.List;

public class PaginationHelper<I> {
    private List<I> collection;
    private int itemPerPage;
    /**
создание класса, который выдаёт информацию по распределению на страницах
     */
    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemPerPage){
        this.collection = collection;
        this.itemPerPage = itemPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount(){
       return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
if (itemPerPage > 0) {
    return (int) Math.ceil(collection.size() / (double) itemPerPage);
} else return -1;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
if(0 < pageIndex + 1 && pageIndex + 1 < pageCount()){
   return itemPerPage;
} else if (pageIndex + 1 == pageCount()){
   return collection.size() - itemPerPage * (pageCount()-1);
} else return -1;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
if (0 <= itemIndex && itemIndex < collection.size()){
    return itemIndex/itemPerPage;
} else return -1;
    }

    public static void main(String[] args) {
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        System.out.println(helper.pageCount());
        System.out.println(helper.itemCount());
        System.out.println(helper.pageItemCount(1));
        System.out.println(helper.pageIndex(0));
        //PaginationHelper<Character> helper2 = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f','a', 'b', 'c', 'd', 'e', 'f','a', 'b', 'c', 'd', 'e', 'f','a', 'b', 'c', 'd', 'e', 'f'), 10);
        //System.out.println(helper2.pageCount());
        //System.out.println(helper2.pageIndex(23));
    }

}
