package InterfacesExe;

//import sun.font.TrueTypeFont;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static ArrayList<String> loadValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index =0;
        System.out.println("Choose\n" + "1 to enter a string \n" +
                "0 to quit");

        while(!quit) {
            System.out.println("Enter option");
            int choice = scanner.nextInt();
            scanner.nextLine();  // what is

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }


        }

        return  values;
    }

    public static void saveObjects(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.save().size(); i++) {
            System.out.println("saving" + objectToSave.save().get(i) + "to the storage device");
        }
    }

    public static void loadObjects(ISaveable loadToObject) {
        ArrayList<String> values = loadValues();
        loadToObject.read(values);
    }
}
