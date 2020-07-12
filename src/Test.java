import java.util.Arrays;
//тестируем Arrays.sort
public class Test {

    private static void swap(int[] array1, int ind1, int ind2) {
        int tmp = array1[ind1];
        array1[ind1] = array1[ind2];
        array1[ind2] = tmp;
    }
    private static int[] sort1(int[] array) {
        boolean a = true;
        while (a) {
            a = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    a = true;
                }
            }
        }
        return array;
    }




    public static void main(String[] args) {
        int[] x = {3, 5, 7, 3, 4, 3, 8, 6, 4, 3, 1};
        int[] y = {9, 8, 7, 6, 5, 5, 2, 6, 8, 4, 5};
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        x=sort1(x);
        Arrays.sort(y);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

    }
}
