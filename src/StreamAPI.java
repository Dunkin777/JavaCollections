import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i= 0; i<=100; i++){
            list.add(i);
        }
        List<Integer> resortedList = list.stream()
                .sorted(Comparator.comparing(list::get).reversed())
                .collect(Collectors.toList());
        for (int i : resortedList) {
            System.out.println(i);
        }
    }
}
