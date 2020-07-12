public class isPrime {
    public static boolean isPrime(int num) {
        boolean result = false;
        int counter = 0;
        for (int i = 1 ; i <= num ; i++ ){
            if (num % i == 0) counter += 1;
        }
        if (counter == 2){
            result = true;
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println(isPrime(75));
    }
}
