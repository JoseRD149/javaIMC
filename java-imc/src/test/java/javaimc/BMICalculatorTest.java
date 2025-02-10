package javaimc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BMICalculatorTest {
    @Test
    public void testCalculateBMI() {
        BMICalculator calculator = new BMICalculator();
        assertEquals(22.09, calculator.calculateBMI(70, 1.78), 0.01);
        assertEquals(27.44, calculator.calculateBMI(85, 1.76), 0.01);
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateBMI(-70, 1.78));
    }

    @Test
    public void testClassifyBMI() {
        BMICalculator calculator = new BMICalculator();
        assertEquals("Delgadez severa", calculator.classifyBMI(15));
        assertEquals("Delgadez leve", calculator.classifyBMI(18));
        assertEquals("Peso normal", calculator.classifyBMI(22));
        assertEquals("Obesidad leve", calculator.classifyBMI(32));
        assertEquals("Obesidad mórbida", calculator.classifyBMI(42));
    }
}
