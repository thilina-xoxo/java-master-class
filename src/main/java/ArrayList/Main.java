package ArrayList;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("076 312 9724");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();

        while(!quit) {
            System.out.println("enter actions");
            int action = scanner.nextInt();
            scanner.nextLine(); // clear the buffer

            switch (action) {
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    printContacts();
            }
        }

    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shut down\n"  +
                "1 - to print contaces\n" +
                "2 - to add new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove existing contact\n" +
                "5 - query if an existing contact exits\n" +
                "6 - to  print list of available actions");
        System.out.println("Choose your action");
    }


    private static void startPhone() {
        System.out.println("Starting phone..");
    }

    private static void printContacts() {
        //mobilePhone.printContacts();
    }
}
