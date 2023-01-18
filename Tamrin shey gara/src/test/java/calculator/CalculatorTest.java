package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Jam_Kond() {
        Calculator calculator = new Calculator();

       String haselJamDoAdad = calculator.add("5.3" , "-2");

        assertEquals("3.3" , haselJamDoAdad);
    }

}