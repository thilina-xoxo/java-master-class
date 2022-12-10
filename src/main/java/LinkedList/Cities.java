package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Cities {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        addInOrder(list, "Melbourne");
        addInOrder(list, "Brisbane");
        addInOrder(list, "Victoria");
        addInOrder(list, "Adelaide");
        addInOrder(list, "Melbourne");

        printList(list);
    }

    private static void printList(LinkedList<String> list) {
        Iterator<String> i = list.iterator();

        while(i.hasNext()) {
            System.out.println("List Item :" + i.next());
        }
        System.out.println("============");
    }

    private static boolean addInOrder(LinkedList<String> list, String newCity) {
        ListIterator<String> stringListIterator = list.listIterator(); // not point to first record

        while(stringListIterator.hasNext()) {
            int value = stringListIterator.next().compareTo(newCity); // use .next() to go to the first entry

            if (value==0) {
                System.out.println(newCity+ " already in the list");
                return false;
            } else if (value>0) {
                // should be appear before
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(value<0) {
                //stringListIterator.add(newCity);
                //return true;
                // move on next city
            }

        }
        stringListIterator.add(newCity);
        return true;
    }
}
