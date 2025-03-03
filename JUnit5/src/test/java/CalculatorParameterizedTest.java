import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class CalculatorParameterizedTest {


    @ParameterizedTest
    @ValueSource(strings = {"Java", "PT", "JS"})
    void testCase1(String str){
        System.out.println("Test Case 1");
//        Assertions.assertTrue(str.isEmpty());
        Assertions.assertFalse(str.isEmpty());
    }
}
