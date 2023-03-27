package PasswordComplexityPolicyMLTest;

import PaswordComplexityPolicy.PasswordComplexityPolicyML;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class PasswordComplexityPolicyMLNegativeTest {

    public static final String CORRECT_PASSWORD_DIGIT_BEGIN = "12qwert";
    public static final String CORRECT_PASSWORD_DIGIT_END = "qw123";

    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Before
    public void prepare(){
        exception.expect(IllegalArgumentException.class);
    }

    @Test
    public void correctForPasswordWith3Digits() {
        PasswordComplexityPolicyML policyMLTest = new PasswordComplexityPolicyML();
        boolean result = policyMLTest.verify(CORRECT_PASSWORD_DIGIT_END);
    }
    @Test
    public void correctForPasswordWith3DigitsOnBeggining() {
        PasswordComplexityPolicyML policyMLTest = new PasswordComplexityPolicyML();
        boolean result = policyMLTest.verify(CORRECT_PASSWORD_DIGIT_BEGIN);

    }
}