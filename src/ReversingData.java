import java.util.Arrays;
//реверс байтов
public class ReversingData {

    public static void main(String[] args) {
int[] data = {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
            int[] reversed_data = new int[data.length];
            int k;
            for (int j = 0; j < data.length;j += 8) {
                int q = 0;
                for (int i = j; i < j + 8; i++) {
                    k = (data.length - 8 - j) + q;
                    reversed_data[k] = data[i];
                    q++;
                }
            }
            System.out.println(Arrays.toString(reversed_data));


        }
}
