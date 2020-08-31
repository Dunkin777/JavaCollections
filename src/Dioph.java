

public class Dioph {
    public static String solEquaStr(long n) {
        StringBuilder result = new StringBuilder("[");
for (int x = 0; x < n; x++){
    for (int y = 0; y < n; y++){
        if ((x-2*y)*(x+2*y) == n){
result.append("[").append(x).append(", ").append(y).append("]");
        }
    }
}
result.append("]");
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(solEquaStr(5));
        System.out.println(solEquaStr(90005));
    }
}
