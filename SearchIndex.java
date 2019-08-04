import java.util.Arrays;

public class SearchIndex {
    public static void main(String[] args) {
        int searchValue = 8;
        Integer[] integerArray= {9,3,5,1,8,5};
        final int indexValue = Arrays.asList(integerArray).indexOf(searchValue);
        System.out.println("Search Value found in position " + indexValue + " of array.");
    }
}