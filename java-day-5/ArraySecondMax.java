/**
 * ArraySecondMax
 */
public class ArraySecondMax {

    public static void main(String[] args) {
        
        int[] numbers = {10, 50, 20, 40, 30};
        int max = numbers[0];
        int secondMax = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                continue;
            }
            if ((numbers[i] > secondMax) && (max > secondMax)) {
                secondMax = numbers[i];
            }
        }

        System.out.println("Max: " + max + " Second Max: " + secondMax);
    }
}