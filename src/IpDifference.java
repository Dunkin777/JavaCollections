import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// проверяет разницу по количеству адресов между двумя ip
public class IpDifference {
    public static long sumIP(List<Integer> list){
        long sum = 0;
        double k = 0;
        for (int i = list.size()-1; i >= 0; i--){
            sum += (int) (Math.pow(256,k)*list.get(i));
            k+=1;
        }
        return sum;
    }

    public int fun(int B){
        return B*2;
    }

    public static Integer BinToDec(Integer bin){
        return Arrays.asList(Arrays.stream(String.valueOf(bin).chars().map(Character::getNumericValue).toArray()).boxed().toArray(Integer[]::new)).stream().reduce((x, y) -> x * 2 + y).get();
    }

    public static List<Integer> StrToListWithRegEx(String string,String regEx){
        return Arrays.stream(string.split(regEx)).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static Integer getV(List<Integer> list, int Base){
        return list.stream().reduce((x, y) -> x * Base + y).orElse(0);
    }

    public static Integer getValue(String str,String regEx, int Base){
        List<Integer> list = Arrays.stream(str.split(regEx)).map(Integer::parseInt).collect(Collectors.toList());
        return list.stream().reduce((x, y) -> x * Base + y).orElse(0);
    }

    public static void main(String[] args) {

        String a = "10.0.0.0";
        String b = "10.0.0.50";

        Integer Value_1 = getValue(a,"\\.",256);
        Integer Value_2 = getValue(b,"\\.",256);
        System.out.println(Math.abs(Value_1-Value_2));


       // String c = StringUtils.difference("20.0.0.10", "20.0.1.0");
      //  System.out.println(c);
        int[] arr1 = Arrays.stream(a.split("\\.")).mapToInt(Integer::parseInt).toArray();
        List<Integer> listB = Arrays.stream(b.split("\\.")).map(Integer::parseInt).collect(Collectors.toList());
        Integer Agr1 = Arrays.stream(arr1).reduce((x, y) -> x * 256 + y).orElse(0);
        Integer Agr2 = listB.stream().reduce((x, y) -> x * 256 + y).orElse(0);
        System.out.println(Agr1);
        System.out.println(Agr2);
        System.out.println(Agr2-Agr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(listB);
        //long sumA = sumIP(listA);
        //System.out.println(sumA);
        Integer[] arr = {1, 0, 0, 1};
        List<Integer> binary = Arrays.asList(arr);
        Integer decimal = binary.stream().reduce((x, y) -> x * 2 + y).get();
        System.out.println(decimal);
        Integer number = 1001;
        Integer binary2 = BinToDec(number);
        System.out.println(binary2);
    }
}
