package TaxCalculator;

public class TaxCalculatorML {
    public  double calculateTax(double amount){
        double tax;
        if(amount <=3091d){
            tax = 0;
        }
        else tax = amount * 0.23;
        return tax;
    }
}
