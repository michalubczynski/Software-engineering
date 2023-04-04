package TaxCalculator;

public class TaxCalculatorML {
    public  double calculateTax(double amount){
        double tax;
        try{Thread.sleep(1000);}
        catch (InterruptedException ex){

        }
        if(amount <= 3091d){
            tax = 0;
        }
        else if ( amount <= 855298d){
            tax = Math.round(amount* 0.18*100)/100d-556.02;
        }
        else tax = 14839.02 + Math.round((amount-85528d)*0.32*100)/100d;


        return tax;

    }
}
