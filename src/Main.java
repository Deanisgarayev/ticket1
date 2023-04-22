import java.util.Arrays;
public class Main {
    public static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        plusNumbers(numbers);
//        printMiddleNumbers(numbers);
        System.out.println(Arrays.toString(getModifiedArray(numbers)));
    }
    public static void plusNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number % 2 == 0) {
                number++;
            }
            System.out.println(number);
        }
    }

//    public static void printMiddleNumbers(int[] numbers) {
//        for (int i = 2; i < numbers[6]; i++) {
//            int number = numbers[i];
//            System.out.println(number);

//        }
//    }
//}
    public static int[] getModifiedArray(int[] numbers) {
        int[] arr = new int[5];
        for (int i = 2; i < 7; i++) {
            arr[i - 2] = numbers[i] % 2 == 0 ? numbers[i] + 1 : numbers[i];
        }
        return arr;
    }
}



