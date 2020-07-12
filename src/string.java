import java.util.Arrays;
import java.util.Comparator;
//сортировка привидённого к другому виду массива (немоя)
public class string {

    public static String orderWeight(String string) {
        String[] split = string.split(" ");
        Arrays.sort(split, new Comparator<String>() {
            public int compare(String a, String b) {
                int aWeight = a.chars().map(c -> Character.getNumericValue(c)).sum();
                int bWeight = b.chars().map(c -> Character.getNumericValue(c)).sum();
                return aWeight - bWeight != 0 ? aWeight - bWeight : a.compareTo(b);
            }
        });
        return String.join(" ", split);
    }

    public static void main(String[] args) {
        String a = orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123");
        System.out.println(a);
        }
    }

