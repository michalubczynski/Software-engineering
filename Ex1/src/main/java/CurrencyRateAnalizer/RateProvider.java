package CurrencyRateAnalizer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Properties;

public class RateProvider {
    Properties rates;
    public void loadFromFiles(String fileLocation) throws IOException{
        System.out.println("Wczytuje z pliku");
        rates = new Properties();
        InputStream fs = new FileInputStream(fileLocation);
        rates.load(fs);
        fs.close();
    }
    public void loadFromStream(InputStream stream) throws IOException{
        System.out.println("Wczytuje ");
    }
    public BigDecimal getRate(String curr){
        String rateStr = rates.getProperty(curr);
        return new BigDecimal(rateStr);
    }
}
