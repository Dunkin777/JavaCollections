import java.util.Arrays;
import java.util.stream.Collectors;

public class StringStrip2 {
    public static String stripComments(String text, String[] commentSymbols) {
        String pattern = String.format(
                "[ ]*([%s].*)?$",
                Arrays.stream(commentSymbols).collect(Collectors.joining())
        );
        return Arrays.stream(text.split("\n" ))
                .map(x -> x.replaceAll(pattern,""))
                .collect(Collectors.joining( "\n" ));
    }


    public static void main(String[] args) {
        String[] a = {"#", "!"};
        String b = "apples, pears # and bananas\ngrapes\nbananas !apples";
        System.out.println(stripComments(b,a));
    }
}
