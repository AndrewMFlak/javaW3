
public class Loop {
    public static void main(String[] args) {
        int indexCount = 0;
        int searchValue = 8;
        Integer[] integerArray= {9,3,5,1,8,5};
        for (int i: integerArray) {
            if (i==searchValue) {
                String something = "found that shit";
                System.out.println(something);
                System.out.println("The current index of search value is" + indexCount);
            }
            indexCount++;
            System.out.println(i);
        };
    }
}
