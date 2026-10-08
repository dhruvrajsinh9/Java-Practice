public class ArrayInsert {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int insertIndex = 2;
        int value = 25;

        int[] newNumbers = new int[numbers.length + 1];

        for (int i = 0; i < newNumbers.length; i++) {

            if (i < insertIndex) {
                newNumbers[i] = numbers[i];

            } else if (i == insertIndex) {
                newNumbers[i] = value;

            } else {
                newNumbers[i] = numbers[i - 1];
            }
        }

        for (int i = 0; i < newNumbers.length; i++) {
            System.out.println(newNumbers[i]);
        }
    }
}