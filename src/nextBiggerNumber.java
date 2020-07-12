


public class nextBiggerNumber{
    public static void main(String[] args) {
        Long a = 123456789L;
        String b = a.toString();
        System.out.println(b);

        String temp = Long.toString(a);
        long[] newGuess = new long[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
        for (int i = 0; i < newGuess.length; i++) {
            System.out.println(newGuess[i]);
        }

        long[] temp_arr = newGuess;
        for (int i = newGuess.length; i > 0; i--){
           // if (newGuess[i])
        }



        for (int i = newGuess.length; i > 0; i--) {

            long t = temp_arr[i];
            temp_arr[i] = temp_arr[i - 1];
            temp_arr[i - 1] = t;
        }
    }

}
