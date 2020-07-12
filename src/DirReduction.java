import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class DirReduction {
    //сокращает направление движения

    public static void main(String[] args) {
        String[] arr = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        System.out.println(Arrays.toString(dirReduc(arr)));
        System.out.println(Arrays.toString(dirReduc2(arr)));


    }
    //моё
    public static String[] dirReduc(String[] arr){
        ArrayList<String> arrTEMP = new ArrayList<>(Arrays.asList(arr));
        int k = 0;
        do {
            k = 0;
            if (arrTEMP.size() >= 2) {
                for (int i = 0; i < arrTEMP.size()-1; i++) {
                    if (arrTEMP.get(i).equals("SOUTH") && arrTEMP.get(i + 1).equals("NORTH"))
                    {
                        arrTEMP.remove(i);
                        arrTEMP.remove(i);
                        k+=1;
                        break;
                    }
                }
            }
            if (arrTEMP.size() >= 2) {
                for (int i = 0; i < arrTEMP.size()-1; i++) {
                    if (arrTEMP.get(i).equals("NORTH") && arrTEMP.get(i + 1).equals("SOUTH"))
                    {
                        arrTEMP.remove(i);
                        arrTEMP.remove(i);
                        k+=1;
                        break;
                    }
                }
            }
            if (arrTEMP.size() >= 2) {
                for (int i = 0; i < arrTEMP.size()-1; i++) {
                    if (arrTEMP.get(i).equals("WEST") && arrTEMP.get(i + 1).equals("EAST")) {
                        arrTEMP.remove(i);
                        arrTEMP.remove(i);
                        k+=1;
                        break;
                    }
                }
            }
            if (arrTEMP.size() >= 2) {
                for (int i = 0; i < arrTEMP.size()-1; i++) {
                    if (arrTEMP.get(i).equals("EAST") && arrTEMP.get(i + 1).equals("WEST"))
                    {
                        arrTEMP.remove(i);
                        arrTEMP.remove(i);
                        k+=1;
                        break;
                    }
                }
            }
        } while (k != 0);

        String[] result = new String[arrTEMP.size()];
        result = arrTEMP.toArray(result);
        return result;
    }
    //не моё
    public static String[] dirReduc2(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
    }
}


