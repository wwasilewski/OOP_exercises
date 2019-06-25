package exercise2;

/**
 * @author Wojciech Wasilewski
 * @date Created on 25.06.2019
 */
public class Main {

    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();
        contact1.name = "Tomasz";
        contact1.email = "email@mail.pl";
        contact1.phoneNumber = "123456789";

        Contact contact2 = new Contact();
        contact2.name = "Anna";
        contact2.email = "email2@mail.pl";
        contact2.phoneNumber = "111111111";

        myContactsManager.addContact(contact1);
        myContactsManager.addContact(contact2);

        myContactsManager.addContact(new Contact("Manna", "email@ww.pl", "333333333"));

        System.out.println(myContactsManager.searchContact("Manna").phoneNumber);

        Contact result = myContactsManager.searchContact("Tomasz");
        System.out.println(result.email);
    }
}
