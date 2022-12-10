package ArrayList;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
      if(findContact(contact)>0) {
          System.out.println(contact.getName() + " is already exist");
          return true;
      }
      return false;
    }

    public boolean updateContact(Contact newContact,Contact oldContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println("Contact not exist");
            return false;
        }
        myContacts.set(position,newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public String queryContact(String contactName) {
        if(findContact(contactName)>0) {
            return myContacts.get(findContact(contactName)).getName();
        }
        return null;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }


}
