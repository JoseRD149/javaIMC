package javaimc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

public class BMICalculatorTest {
    @Test
    public void testCalculateBMI() {
        BMICalculator calculator = new BMICalculator();
        double bmi = calculator.calculateBMI(70, 1.75);
        assertEquals(22.86, bmi, 0.01); // Esperamos un resultado cercano a 22.86
    }
}
