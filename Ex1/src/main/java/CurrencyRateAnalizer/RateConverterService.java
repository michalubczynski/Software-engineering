package CurrencyRateAnalizer;

import java.math.BigDecimal;

public class RateConverterService {
    private RateProvider rateProvider;
    private CurrencyRoundService currencyRoundService;

    public RateConverterService(RateProvider rateProvider, CurrencyRoundService currencyRoundService) {
        super();
        this.rateProvider = rateProvider;
        this.currencyRoundService = currencyRoundService;
    }
    public BigDecimal convert(String currency, BigDecimal amount){
        return currencyRoundService.round(amount.multiply(rateProvider.getRate(currency)));
    }
}
