package CurrencyRateAnalizer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class CurrencyRoundServiceTest2 {
    @Parameterized.Parameters(name = "{index}: round({1})=({2})")

    public static Iterable<Object[]> testData(){
        return Arrays.asList(new Object[][] {
                {0, BigDecimal.valueOf(123.456), BigDecimal.valueOf((123))},
                {1, BigDecimal.valueOf(123.456), BigDecimal.valueOf((123.5))},
                {2, BigDecimal.valueOf(123.456), BigDecimal.valueOf((123.46))}
        });
    }
    @Parameterized.Parameter(0) //alternate @Parameterized.Parameter(value = 0)
    public int roundPrecision;
    @Parameterized.Parameter(1) //alternate @Parameterized.Parameter(value = 1)
    public BigDecimal testedValue;
    @Parameterized.Parameter(2) //alternate @Parameterized.Parameter(value = 2)
    public BigDecimal expectedValue;
    @Test
    public void shouldRoundAmount(){
        CurrencyRoundService currencyRoundService = new CurrencyRoundService(roundPrecision);
        BigDecimal result = currencyRoundService.round(testedValue);
        assertThat(result, is(equalTo(expectedValue)));
    }
}