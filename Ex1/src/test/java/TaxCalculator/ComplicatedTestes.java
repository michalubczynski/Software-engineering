package TaxCalculator;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(Complicated.class)
@Suite.SuiteClasses({CitCalculateMLTest.class, TaxCalculatorMLTest.class})
public class ComplicatedTestes {
}
