import java.util.Arrays;
//матзадачка
public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        int hour;
        int min;
        int sec;
        double time;
        if (v1 < v2) {
        time = (double) g/(v2 - v1);
        int t = (int) ( time * 3600 );
        hour = t/3600;
        t %= 3600;
        min = t/60;
        t %= 60;
        sec = t;
            return new int[]{hour, min, sec};
        } else return null;
    }
    public static void main(String[] args) {
        ;
System.out.println(Arrays.toString(Tortoise.race(720, 850, 70)));



    }


}
