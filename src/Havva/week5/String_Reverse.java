package Havva.week5;

public class String_Reverse {
    //String_Reverse
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {

            String str = "ABCD";
            System.out.println(reverse(str));  // output==>> "DCBA"


    }
    public static String reverse(String str) {
        StringBuilder reversedString = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));//add each character to object reversed
            //when we use  StringBuilder, we do not need concatenation, append() does concatenation
        }

        return reversedString.toString();
    }

}
