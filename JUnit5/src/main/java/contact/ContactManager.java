package contact;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager {

    Map<String, Contact> contactList = new ConcurrentHashMap<>();

    public void addContact(String firstName, String lastName, String phoneNumber){
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        validateContact(contact);
        checkIfContactAlreadyExist(contact);
    }

    public Collection<Contact> getAllContacts(){
        return contactList.values();
    }

    public void validateContact(Contact contact){
        contact.validateFirstName();
        contact.validateLastName();
        contact.validatePhoneNUmber();
    }

    public void checkIfContactAlreadyExist(Contact contact){
        if(contactList.containsKey(generateKey(contact))){
            throw new RuntimeException("Contact already exists");
        }
    }

    private String generateKey(Contact contact) {
        return contact.getFirstName()  + "-" + contact.getPhoneNumber() + "-" + contact.getPhoneNumber() ;
    }

}
