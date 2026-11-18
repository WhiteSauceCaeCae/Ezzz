package question2.tests;

import question2.ProductCalculations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductCalculationsTest {

    @Test
    void GetVat_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        assertEquals(525.0, calc.GetVat(), 0.001);
    }
}
