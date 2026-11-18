package question1.tests;

import question1.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    private Product createProduct() {
        String[] names = {"Cozy Nights Monarch mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};
        int[][] sales = {{25, 18, 20}, {15, 15, 10}, {12, 18, 20}};
        return new Product(names, sales);
    }

    @Test
    void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        assertEquals(153, createProduct().GetTotalProductsSold());
    }

    @Test
    void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        assertEquals(17.0, createProduct().GetAverageProductSold(), 0.001);
    }
}
