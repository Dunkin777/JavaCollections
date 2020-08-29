import java.math.BigInteger;

public class recurtion {
//факториал через рекурсию
    public static int factorial(int n){
        if(n >= 1){
            return n * factorial(n - 1);
        } else return 1;
    }

    public static String Factorial(int n) {
        if (n<0){return null;}
        BigInteger result = BigInteger.valueOf(0);
        for (int i = 1; i <=n; i ++){
            BigInteger j = BigInteger.valueOf(i);
            result = result.multiply(j);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        BigInteger biginteger = BigInteger.valueOf(456);
        System.out.println(Factorial(5));
    }
}
