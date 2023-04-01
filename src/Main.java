import java.util.Arrays;

public class Main {
    public static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        printNumbers(numbers);
        plusNumbers(numbers);
        printMiddleNumbers(numbers);
    }

    public static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void plusNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i = i + 2) {
            int number = numbers[i];
            number = number + 2;
            System.out.println(number);
        }
    }

    public static void printMiddleNumbers(int[] numbers) {
        for (int i = 2; i < numbers[6]; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
    }
}




