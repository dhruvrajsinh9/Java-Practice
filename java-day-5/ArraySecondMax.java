
public class ArraySecondMax {

    public static void main(String[] args) {

        int[] numbers = { 10, 50, 20, 40, 30 };

        if (numbers.length == 0) {
            System.out.println("Array must not be empty.");
            return;
        }

        int max = numbers[0];
        int secondMax = 0;
        boolean hasSecondMax = false;

        for (int i = 1; i < numbers.length; i++) {

            int current = numbers[i];

            if (current > max) {
                secondMax = max;
                max = current;
                hasSecondMax = true;

            } else if (current < max &&
                    (!hasSecondMax || current > secondMax)) {
                secondMax = current;
                hasSecondMax = true;
            }
        }

        System.out.println("Maximum: " + max);

        if (hasSecondMax) {
            System.out.println("Second maximum: " + secondMax);
        } else {
            System.out.println("No second-largest distinct value exists.");
        }
    }
}
