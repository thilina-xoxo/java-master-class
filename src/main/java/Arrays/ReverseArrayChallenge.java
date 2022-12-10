package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        //int[] reverseNumbers = reverseArray(numbers);
        printArray(numbers);
        System.out.println("Reverse array");
        //printArray(reverseNumbers);
        //System.out.println("Reverse New");
        reverseArrayHalf(numbers);
        printArray(numbers);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] reverseArray(int[] arr) {
        int[] reverseArray = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            reverseArray[i] = arr[arr.length-1-i];
        }
        return reverseArray;
    }

    private static void reverseArrayHalf(int[] arr) {
        int maxLength = arr.length;
        int halfLength = maxLength/2;
        int temp = 0;

        for (int i = 0; i < halfLength; i++) {
            temp = arr[i];
            arr[i] = arr[maxLength-1-i];
            arr[maxLength-1-i] = temp;
        }
    }
}
