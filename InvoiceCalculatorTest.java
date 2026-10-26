package com.example.invoice;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class InvoiceCalculatorTest {
    InvoiceCalculator calculator = new InvoiceCalculator();
    @Test
    void testCalculatePA() {
        double result = calculator.calculatePA(1000, 5);
        assertEquals(5000, result);
    }
    @Test
    void testCalculateDAFor10PercentDiscount() {
        double result = calculator.calculateDA(5000);
        assertEquals(500, result);
    }
    @Test
    void testCalculateDAFor5PercentDiscount() {
        double result = calculator.calculateDA(3000);
        assertEquals(150, result);
    }
    @Test
    void testCalculateDAForNoDiscount() {
        double result = calculator.calculateDA(1000);
        assertEquals(0, result);
    }
    @Test
    void testCalculateGST() {
        double result = calculator.calculateGST(5000);
        assertEquals(900, result);
    }
    @Test
    void testCalculateFAFor10PercentDiscount() {
        double result = calculator.calculateFA(5000);
        assertEquals(5310, result);
    }
    @Test
    void testCalculateFAFor5PercentDiscount() {
        double result = calculator.calculateFA(3000);
        assertEquals(3363, result);
    }
    @Test
    void testCalculateFAForNoDiscount() {
        double result = calculator.calculateFA(1000);
        assertEquals(1180, result);
    }
}