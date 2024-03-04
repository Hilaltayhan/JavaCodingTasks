package Havva.week6;

public class String_PasswordValidation {

//1. Write a return method that can verify if a password is valid or not.
//requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper-case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special character
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns  false

        public static boolean isValidPassword(String password) {
            if (password == null || password.length() < 6 || password.contains(" ")) {
                return false; // Check for minimum length and absence of spaces
            }

            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                } else {
                    hasSpecialChar = true;
                }

                // If all conditions are met, no need to continue checking
                if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
                    return true;
                }
            }

            // If any condition is not met, return false
            return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
        }

        public static void main(String[] args) {
            // Test the method with a valid password
            String password = "Password#1";
            System.out.println(password +"   Is the password valid? " + isValidPassword(password));

            // Test the method with an invalid password
            String invalidPassword = "pass";
            System.out.println("Is the password valid? " + isValidPassword(invalidPassword));
        }
    }


