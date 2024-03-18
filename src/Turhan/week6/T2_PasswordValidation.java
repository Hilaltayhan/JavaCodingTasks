package Turhan.week6;

public class T2_PasswordValidation {
    public static void main(String[] args) {
        System.out.println("passwordValidation = " + passwordValidation("Ntr23k25?"));
    }

    public static boolean passwordValidation(String password) {

        boolean isUpperCase = false,
                isLowerCase = false,
                isSpecialCharacter = false,
                isDigit = false,
                isValidLengthAndNoSpace = false;



        if (password.length() >= 6 && !password.contains(" ")) {
            isValidLengthAndNoSpace = true;

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                 if (Character.isUpperCase(ch)) {
                    isUpperCase = true;
                }
                else if (Character.isLowerCase(ch)) {
                    isLowerCase = true;
                }
                 else if (Character.isDigit(ch)) {
                    isDigit = true;
                }else {
                     isSpecialCharacter = true;
                 }
            }

            }



        return isUpperCase && isLowerCase && isSpecialCharacter && isDigit && isValidLengthAndNoSpace;
    }
}
//TC 2️  String_PasswordValidation
//1. Write a return method that can verify if a password is valid or not.
//requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper-case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special character
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns  false