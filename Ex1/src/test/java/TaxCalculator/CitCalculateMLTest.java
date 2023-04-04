package TaxCalculator;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class CitCalculateMLTest {

    @Category(Complicated.class)
    public void shouldCalculate() {
    CitCalculateML citCalculateML = new CitCalculateML();
    double tax = citCalculateML.calculateTax(1000000d);
    assertEquals(190000d,tax,0.000001);
    }
    @Test(timeout = 50)
    @Category(Easy.class)
    public void shoulBeZero() {
        CitCalculateML citCalculateML = new CitCalculateML();
        double tax = citCalculateML.calculateTax(0d);
        assertEquals(0d,tax,0.000001);
    }
}