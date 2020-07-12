import java.util.Arrays;

public class AreSame {
    /*сравнивает 2 массива, если эллементы первого возвести в квадрат*/
    public static boolean comp(int[] a, int[] b) {
        boolean result = false;
        if (a != null && b!= null) {
            for (int i = 0; i < a.length; i++) {
                a[i] *= a[i];
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int schetchic = 0;
            if (a.length == b.length) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] == b[i]) {
                        schetchic += 1;
                    }
                }
            }
            if (schetchic == b.length) {
                result = true;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] a = null; //new int[]{121, 144, 19, 161, 19, 144, 19, 0};
        int[] b = new int[]{0, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(a,b));
    }
}