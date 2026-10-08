public class ArraySearch {

    public static void main(String[] args) {

        int[] numbers = {34, 91, 67, 5, 12, 42};
        int target = 5;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                System.out.println("Number found at position: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found!");
        }
    }
}