package Kavi.program1.DataStrucures.Arrays;

public class Array {
    public static void main(String[] args) {

        // integer array
        int[] firstArray = new int[10];
        firstArray[0] = 10;
        firstArray[1] = 20;

        int[] secondArray = {1,2,3,4,5};

        // loops
        // print secondArray
        for (int i = 0; i < secondArray.length ; i++) {
            System.out.println(secondArray[i]);
        }

        // for each
        for (Integer number :
                secondArray) {
            System.out.println(number);
        }

        // write a for each loop to print element's Shape and size of each object
    }
}
