package TaxCalculator;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class CitCalculateMLTest {

    @Test
    @Category(Complicated.class)
    public void shouldCalculate() {
    CitCalculateML citCalculateML = new CitCalculateML();
    double tax = citCalculateML.calculateTax(1000000d);
    assertEquals(190000d,tax,0.000001);
    }
    @Test
    @Category(Easy.class)
    public void shoulBeZero() {
        CitCalculateML citCalculateML = new CitCalculateML();
        double tax = citCalculateML.calculateTax(0d);
        assertEquals(0d,tax,0.000001);
    }
}