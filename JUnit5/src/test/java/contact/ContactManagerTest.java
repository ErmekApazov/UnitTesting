package contact;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {

    ContactManager contactManager;

    @BeforeAll
    public static void printFirst(){
        System.out.println("Print before all tests");
    }

    @BeforeEach
    public void setup(){
        contactManager = new ContactManager();
    }
            // this method helps to do one operation when you run all test methods
            // means you don't have to create an object of ContactManager in every test method.



    @Test
    public void shouldCreateContact() {

//        ContactManager contactManager = new ContactManager();

        contactManager.addContact("John", "Doe", "0123456789");

        // to verify if contactList is not empty, see below:
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        // to verify if contactManager's size is 1:
        Assertions.assertEquals(1, contactManager.getAllContacts().size());

        /*The Assertions class in JUnit 5 provides a set of static assertion methods to help verify expected outcomes
        in test cases. These methods are used to compare actual results with expected values and throw an assertion
        error if the condition is not met, which causes the test to fail.

        Key Features of Assertions in JUnit 5:
            Verify Expected Output: Ensures test results match expected values.
            Readable and Maintainable Code: Provides meaningful failure messages.
            Supports Multiple Assertions: Can check multiple conditions in one test case.
            Exception Testing: Validates if an exception is thrown in specific scenarios.

            ------------------------------------------------------
        1. assertEquals(expected, actual):  Checks if the actual value matches the expected value.
        2. assertNotEquals(expected, actual): Ensures two values are not equal
        3. assertTrue(condition) / assertFalse(condition): Checks if a condition is true or false.
        4. assertNull(object) / assertNotNull(object): Checks if an object is null or not null.
        5. assertThrows(exception.class, executable): Validates if a specific exception is thrown.
        6. assertAll(name, executable1, executable2, ...): Executes multiple assertions and reports all failures instead of stopping at the first failure.


            */

        Assertions.assertTrue(contactManager.getAllContacts().stream()
                .filter(contact -> contact.getFirstName().equals("John") &&
                        contact.getLastName().equals("Doe") &&
                        contact.getPhoneNumber().equals("0123456789"))
                .findAny()
                .isPresent());

        // ---------------------------instead of filter() -> anyMatch() --------------------------------

        Assertions.assertTrue(contactManager.getAllContacts().stream()
                .anyMatch(contact -> contact.getFirstName().equals("John") &&
                        contact.getLastName().equals("Doe") &&
                        contact.getPhoneNumber().equals("0123456789")));
    }
        // --------------------------------------------------------------------------------------------

        @Test
        @DisplayName("😀 Should Not Create Contact When First name is Null")
        public void shouldThrowRuntimeExceptionWhenFirstNameIsNull() {

//            ContactManager contactManager = new ContactManager();

            Assertions.assertThrows(RuntimeException.class, () -> {
                contactManager.addContact(null, "Doe", "0123456789");
            });
        }

        @Test
        @DisplayName("😀 Should Not Create Contact When Last Name is Null")
        public void shouldTrowRuntimeExceptionWhenLastNameIsNull(){

//            ContactManager contactManager = new ContactManager();

            Assertions.assertThrows(RuntimeException.class, () -> {
                contactManager.addContact("John", null, "0123456789");
            });
        }

        @Test
        @DisplayName("☎ Should Not Create Contact When Phone Number is Null")
        public void shouldThrowRuntimeExceptionWhenPhoneNumberIsNull(){

//            ContactManager contactManager = new ContactManager();


            Assertions.assertThrows(RuntimeException.class, () -> {
                contactManager.addContact("John", "Doe", null);
            });
        }

        /*The @DisplayName() annotation in JUnit 5 is used to provide a custom, human-readable name for test classes
        and methods. Instead of relying on method names (which follow Java naming conventions), @DisplayName allows
        you to write descriptive test names that improve readability in test reports.

        🔹 Key Purpose of @DisplayName
            Makes test reports more readable by showing a friendly name.
            Allows spaces, special characters, and emojis in test names.
            Helps in better documentation of test cases.
        */




}