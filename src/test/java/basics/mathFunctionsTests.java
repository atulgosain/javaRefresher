package basics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mathFunctionsTests {

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        mathFunctions calculator = new mathFunctions();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

}
