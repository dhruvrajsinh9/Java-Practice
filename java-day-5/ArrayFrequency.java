public class ArrayFrequency {

    public static void main(String[] args) {
        int[] numbers = {3, 3, 3, 2, 2, 7, 3};
        boolean[] counted = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (counted[i]) {
                continue;
            }
            int frequency = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    frequency++;
                    counted[j] = true;
                }
            }
            System.out.println(numbers[i] + " occurs " + frequency + " time(s)"+ counted[i]);
        }
    }
}