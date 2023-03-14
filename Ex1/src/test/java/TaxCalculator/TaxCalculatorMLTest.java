package TaxCalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxCalculatorMLTest {

    @Test
    public void shouldBeTaxFree(){
        TaxCalculatorML calculatorML = new TaxCalculatorML();
        double tax = calculatorML.calculateTax(3091);
        assertEquals(0d,tax,0.000001);
    }
    @Test
    public void shouldBeTax23Percent(){
        TaxCalculatorML calculatorML = new TaxCalculatorML();
        double tax = calculatorML.calculateTax(4000);
        assertEquals(920,tax,0.000001);
    }
}