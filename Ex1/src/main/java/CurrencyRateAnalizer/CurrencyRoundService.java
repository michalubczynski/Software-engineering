package CurrencyRateAnalizer;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyRoundService {
    private int roundPrecision;

            public CurrencyRoundService(int roundPrecision){
            super();
            this.roundPrecision = roundPrecision;
            }
            public BigDecimal round(BigDecimal amount){
            return amount.setScale(roundPrecision, RoundingMode.HALF_UP);
            }
}
