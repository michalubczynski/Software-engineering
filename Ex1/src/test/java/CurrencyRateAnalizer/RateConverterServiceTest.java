package CurrencyRateAnalizer;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RateConverterServiceTest {
@Test
    public void test(){
    RateProvider rateProvider = mock(RateProvider.class);
    when(rateProvider.getRate("EUR")).thenReturn(BigDecimal.valueOf(4));
    RateConverterService rateConverterService = new RateConverterService(rateProvider, new CurrencyRoundService(2));
    BigDecimal result  = rateConverterService.convert("EUR", BigDecimal.valueOf(10));
    assertEquals(new BigDecimal("40.00"),result);
}
}