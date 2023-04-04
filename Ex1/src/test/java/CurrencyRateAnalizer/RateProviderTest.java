package CurrencyRateAnalizer;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExternalResource;
import org.junit.rules.TemporaryFolder;

import java.io.*;
import java.math.BigDecimal;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class RateProviderTest {
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();
    private InputStream stream;
    @Rule
    public ExternalResource resource = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            System.out.println("Tworze zasob");
            stream = new ByteArrayInputStream("USD=3.95".getBytes());
        }

        @Override
        protected void after() {
            System.out.println("Zamykam zasob");
            try {
                stream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    };
    @Test
    public void shouldReadRateStream() throws IOException {
        RateProvider provider = new RateProvider();
        provider.loadFromStream(stream);
        BigDecimal result = provider.getRate("USD");
        assertThat(result,equalTo(new BigDecimal("3.95")));
    }

    @Test
   // @Ignore
    public void shouldReadRate() throws IOException {
        File file = temporaryFolder.newFile();
        System.out.println(file.getAbsolutePath());
        Properties properties= new Properties();
        properties.put("USD","3.95");
        OutputStream outputStream = new FileOutputStream(file);
        properties.store(outputStream, null);
        outputStream.close();
        RateProvider rateProvider = new RateProvider();
        rateProvider.loadFromFiles(file.getAbsolutePath());
        BigDecimal result = rateProvider.getRate("USD");
        assertThat(result, equalTo( new BigDecimal("3.95")));
    }
}