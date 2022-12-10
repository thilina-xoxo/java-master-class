package Arrays;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnedArray = readIntegers(count);
        int minimumNo = findMininum(returnedArray);
        System.out.println("Minimum no of the array: " + minimumNo);
    }

    // read integers method
    private static int[] readIntegers(int count) {
      int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a no");
            int no = scanner.nextInt();
            scanner.nextLine();
            array[i] = no;
        }

      return array;
    }

    // find minimum method
    private static int findMininum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }
}
