public class Duplicate {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] input2 = {1, 2, 3, 4, 1};
        System.out.println(isDuplicate(input1));
        System.out.println(isDuplicate(input2));
        }

        public static boolean isDuplicate(int[] input){
        for (int i = 0; i < input.length; i++){
            for (int j = 0; j < input.length; j++) {
                if (i == j) {
                    continue;
                }
                if (input[i] == input[j]){
                    return true;
                }
            }
        }
        return false;
        }
}
