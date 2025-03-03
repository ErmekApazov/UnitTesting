package contact;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {

    @Test
    public void shouldCreateContact() {

        ContactManager contactManager = new ContactManager();
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

    }

}