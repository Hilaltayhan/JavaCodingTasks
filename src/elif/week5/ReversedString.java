package elif.week5;

public class ReversedString {
    public static void main(String[] args) {

        System.out.println(reversedString("ABCD"));
    }

    public static String reversedString(String input) {
        String reversedString= "";
        for (int i = input.length() - 1; i >= 0; i--) {
            char currentChar = input.charAt(i);
            reversedString += currentChar;
        }
        return reversedString;
    }
}
/*
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */