package ArrayList;

import java.util.ArrayList;

public class AutoboxingUnboxing {
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);

        for (int i = 0; i < 10; i++) {
            intList.add(Integer.valueOf(i));  // take primitive type and convert into class type
            // autoboxing
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ---> " + intList.get(i).intValue()); // Unboxing
        }

        // this automatically happens in modern compilers

        // For doubles

        // autoboxing
        //Double.valueof(dbl)

        //unboxing
        //dbl.doubleValue()
    }
}
