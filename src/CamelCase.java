import java.util.Arrays;

public class CamelCase {
//приводит к CamelCase

    static String toCamelCase(String s){
        String[] parts = s.split("[_-]");
        String camelCaseString = parts[0];
        for (int i = 1;i < parts.length; i++){
            camelCaseString = camelCaseString + toProperCase(parts[i]);
        }
        return camelCaseString;
    }

    static String toProperCase(String s) {
        return s.substring(0, 1).toUpperCase() +
                s.substring(1).toLowerCase();
    }


    public static void main(String[] args) {

//System.out.println(toCamelCase("the_stealth_warrior"));
String input = "the_stealth_warrior";
        String[] words = input.split("[-_]");
        String output = Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
        System.out.println(output);
    }
}
