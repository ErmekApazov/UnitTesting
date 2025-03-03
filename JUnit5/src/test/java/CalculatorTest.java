import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add(){
        System.out.println("add method");
        int actual = Calculator.add(2,3);
        assertEquals(5, actual, "Test failed");
    }

    @Test
    void add2(){
        System.out.println("add method 2");
        int actual = Calculator.add2(3, 2); // if a<b "add method 2 will execute. test passed. if a>b, will fail
        assertThrows(IllegalArgumentException.class, ()-> Calculator.add2(3,2));
    }

    @Test
    void testCase1(){
        fail("Not implemented yet.");
    }

    @Test
    void testCase2(){
        System.out.println("Test Case 2");
        assertEquals("add", Calculator.operator); // expect string "add"
        assertEquals("minus", Calculator.operator2);
        assertTrue(Calculator.operator.equalsIgnoreCase("add"));
//        assertTrue(Calculator.operator.equalsIgnoreCase("add2")); // should me "add" not "add2";
    }

    @Test
    void testCase3(){
        System.out.println("Test Case 3");
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3}, "Arrays are not same" );
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,3,2}, "Arrays are not same");
    }

    @Test
    void testCase4(){
        System.out.println("Test Case 4");

        String nullString = null;
        String notNullString = "Not Null";

        assertNull(nullString);
        assertNotNull(notNullString);

        assertNotNull(nullString);
        assertNull(notNullString);
    }

    @Test
    void testCase5(){
        System.out.println("Test Case 5");

        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();

        assertSame(c1, c2);
        assertSame(c1, c3, "Two objects are not the same");

    }








}