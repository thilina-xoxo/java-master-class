package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class main {

    private static Scanner scanner = new Scanner(System.in);   // why this is static -> find about static keyword

    public static void main(String[] args) {

        int[] arr = getIntegers(5);
        printArray(arr);
        int[] sortedArr = sortIntegers(arr);
        printArray(sortedArr);

    }

    public static int[] getIntegers(int no) {

        int[] arr = new int[no];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;

    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int[] sortIntegers(int[] arr) {

        int[] sorted = new int[arr.length];

        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = arr[i];
        }

        // alternate method to copy array
        // int[] sortedNew = Arrays.copyOf(arr,arr.length);

        boolean flag = true;
        int temp;

        while(flag) {
            flag =false;

            for (int i = 0; i < sorted.length-1; i++) {
                if( sorted[i] < sorted[i+1] ) {
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag=true;
                }
            }
        }
        return sorted;

    }

}
