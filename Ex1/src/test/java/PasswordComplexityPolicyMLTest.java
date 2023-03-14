import PaswordComplexityPolicy.PasswordComplexityPolicyML;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordComplexityPolicyMLTest {

    public static final String CORRECT_PASSWORD_DIGIT_BEGIN = "123qwert";
    public static final String CORRECT_PASSWORD_DIGIT_END = "qwert123";

    @Test
    public void correctForPasswordWith3Digits() {
        PasswordComplexityPolicyML policyMLTest = new PasswordComplexityPolicyML();
        boolean result = policyMLTest.verify(CORRECT_PASSWORD_DIGIT_END);
        assertTrue("Wynik",result);
    }
    @Test
    public void correctForPasswordWith3DigitsOnBeggining() {
        PasswordComplexityPolicyML policyMLTest = new PasswordComplexityPolicyML();
        boolean result = policyMLTest.verify(CORRECT_PASSWORD_DIGIT_BEGIN);
        assertTrue("Wynik",result);
    }
}