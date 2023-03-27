package TaxCalculator;

public class CitCalculateML {
    public double calculateTax(double amount){
        return Math.round(amount * 0.19 * 100)/100d;
    }
}
