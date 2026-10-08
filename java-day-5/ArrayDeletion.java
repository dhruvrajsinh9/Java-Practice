public class ArrayDeletion {
    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40, 50 };
        int[] newNumbers = new int[numbers.length - 1];
        int deleteIndex = 4;

        for (int i = 0; i < newNumbers.length; i++) {

            if (i < deleteIndex) {
                newNumbers[i] = numbers[i];
            } else {
                newNumbers[i] = numbers[i + 1];
            }
        }

        for (int i = 0; i < newNumbers.length; i++) {
            System.out.println(newNumbers[i]);
        }

    }
}