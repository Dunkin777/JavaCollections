//сортировка привидённого к другому виду массива (моя)
public class WeightSort {

    public static void main(String[] args) {
//String a = "56 65 74 100 99 68 86 180 90";
        String a = "2000 10003 1234000 44444444 9999 11 11 22 123";
String[] b  = a.split(" "); //b - массив строк
int[] temp = new int[b.length];
for (int i = 0;i < b.length; i++) {
    int sum = 0;
    for (int j = 0; j < b[i].length(); j++) {
        sum += Character.getNumericValue(b[i].charAt(j));
    }
    temp[i] = sum;
 }
for (int i = 0; i < b.length-1; i++){
    for (int j = 0; j < b.length-1; j++){
        if (temp[j] > temp[j+1]) {
           int p1 = temp[j];
           String p2 = b[j];
           temp[j] = temp[j+1];
           b[j] = b[j+1];
           temp[j+1] = p1;
           b[j+1] = p2;
        }
    }
}
        for (int i = 0; i < b.length-1; i++){
            for (int j = 0; j < b.length-1; j++){
                if (temp[j] == temp[j+1]) {
                    if (b[j].compareTo(b[j+1]) > 0) {
                        int p1 = temp[j];
                        String p2 = b[j];
                        temp[j] = temp[j + 1];
                        b[j] = b[j + 1];
                        temp[j + 1] = p1;
                        b[j + 1] = p2;
                    }
                }
            }
        }
String result_string = b[0];

        for (int i = 1;i < b.length; i++){
            result_string += " " +b[i];
            }
        System.out.println(a);
System.out.println(result_string);

    }
}
