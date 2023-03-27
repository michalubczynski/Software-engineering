package PaswordComplexityPolicy;

public class PasswordComplexityPolicyML {
    private static final int MIN_LENGTH = 8;
    private static final int MIN_DIGITS = 3;

    public boolean verify(String password){
        int pwdLength = password.length();
        int digitCount =0;
        for(int i=0; i<pwdLength ;i++){
            if(Character.isDigit(password.charAt(i)))digitCount++;
        }
        boolean result = true;
        if(pwdLength < MIN_LENGTH) { throw new IllegalArgumentException();}
        if( digitCount < MIN_DIGITS) { throw  new IllegalArgumentException();}
        return result;
    }
}
