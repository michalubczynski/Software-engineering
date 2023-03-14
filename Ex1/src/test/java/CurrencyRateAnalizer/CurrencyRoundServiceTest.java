package CurrencyRateAnalizer;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class CurrencyRoundServiceTest {
    @Parameterized.Parameters(name = "{index}: round({1})=({2})")

    public static Iterable<Object[]> testData(){
        return Arrays.asList(new Object[][] {
                {0, BigDecimal.valueOf(123.456), BigDecimal.valueOf((123))},
                {1, BigDecimal.valueOf(123.456), BigDecimal.valueOf((123.5))},
                {2, BigDecimal.valueOf(123.456), BigDecimal.valueOf((123.46))}
        });
    }

    public int roundPrecision;

    public BigDecimal testedValue;

    public BigDecimal expectedValue;
    public CurrencyRoundServiceTest(int roundPrecision,BigDecimal testedValue, BigDecimal expectedValue){
        super();
        this.roundPrecision = roundPrecision;
        this.testedValue = testedValue;
        this.expectedValue = expectedValue;
    }
    @Test
    public void shouldRoundAmountVerClassic(){
        CurrencyRoundService currencyRoundService = new CurrencyRoundService(roundPrecision);
        BigDecimal result = currencyRoundService.round(testedValue);
        assertThat(result, is(equalTo(expectedValue)));
    }
}