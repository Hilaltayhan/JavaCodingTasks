package elif.week06;

public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println("password(\"m#Ps@ap$V\") = " + password("m#Ps@ap$V"));

    }

    public static boolean password(String password) {
        Boolean isDigit = false;
        Boolean isUpperCase = false;
        Boolean isLowerCase = false;
        Boolean isSpecialChar = false;


        if (password.length() >= 6) {
            for (char each : password.toCharArray()) {
                if (Character.isDigit(each)) {
                    isDigit = true;
                } else if (Character.isUpperCase(each)) {
                    isUpperCase = true;
                } else if (Character.isLowerCase(each)) {
                    isLowerCase = true;
                } else {
                    isSpecialChar = true;
                }
            }
        }
        return isDigit && isLowerCase && isUpperCase && isSpecialChar;
    }
}
/*
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
 */