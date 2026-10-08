public class TestExample {
    public static void main (String[] args) {
        int[] numbers = {34,91,67,5,12,42};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Max:" + max + "Min:" + min);
    }
}