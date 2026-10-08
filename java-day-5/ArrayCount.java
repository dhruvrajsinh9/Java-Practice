public class ArrayCount {
    public static void main(String[] args) {

        int[] numbers = { 5, 2, 5, 8, 5, 3 };
        int target = 5;
        int count = 0;
        int[] positions = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                positions[count] = i;
                count++;
            }
        }

        System.out.println("The occurrence of " + target + " is " + count);

        System.out.print("Positions: ");

        for (int i = 0; i < count; i++) {
            System.out.print(positions[i] + " ");
        }
    }
}