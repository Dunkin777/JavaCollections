import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringStrip {
    public static String stripComments(String text, String[] commentSymbols) {
        String[] splitedString = text.split("\n");
        for (int i = 0; i < splitedString.length;i++){
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < splitedString[i].length(); j++){
                int x=0;
                for (String k : commentSymbols){
                    if (splitedString[i].charAt(j) == k.charAt(0)){
                        x+=1;
                    }
                }
                if (x == 0) {
                    temp.append(splitedString[i].charAt(j));
                } else break;

            }
            splitedString[i] = temp.toString().trim();
        }
        return String.join("\n",splitedString);
    }
    public static void main(String[] args) {
        String[] a = {"#", "!"};
        String b = "apples, pears # and bananas\ngrapes\nbananas !apples";
        System.out.println(stripComments(b,a));
//Stream<Character> stream =
    String n = "cvf";
char v = n.charAt(1);
n=n+v;
System.out.println(n);
    }
}
