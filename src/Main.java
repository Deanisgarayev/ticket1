import java.util.Arrays;

public class Main {
    public static int[] printArr() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
        }
        return numbers;
    }


    public static void main(String[] args) {
        int[] arr = printArr();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            plusNumber(number);
        }

    }

    public static void plusNumber(int numberA) {
        if (numberA % 2 == 0) {
            numberA ++;
            System.out.println(numberA);
        }
    }
}


