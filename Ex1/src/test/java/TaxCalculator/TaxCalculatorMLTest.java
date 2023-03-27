package TaxCalculator;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;
import static org.junit.Assume.assumeThat;
import static org.junit.Assume.assumeTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TaxCalculatorMLTest {
    private TaxCalculatorML taxCalculatorML;
    @BeforeClass
    public static void prepareForAll(){
        System.out.println("Prep all");
    }
    @Before
    public void prepare (){
        assumeThat(System.getProperty("os.name"),not(startsWith("Windows")));
        taxCalculatorML = new TaxCalculatorML();
        System.out.println("Prepare");
    }
    @After
    public void cleanUp(){
        System.out.println("Cleaning");
    }
    @Test
    @Ignore
    @Category(Easy.class)
    public void shouldBeTaxFree(){
        double tax = taxCalculatorML.calculateTax(3091);
        assertEquals(0d,tax,0.000001);
    }
    @Test
    @Category({Complicated.class, Easy.class})
    public void shouldBeTax23Percent(){
        //assumeTrue(!System.getProperty("os.name").startsWith("Windows"));
        assumeTrue(!System.getProperty("os.name").startsWith("Linux"));
        double tax = taxCalculatorML.calculateTax(4000);
        assertEquals(163.98,tax,0.000001);
    }
}