package Turhan.week6;

public class T1_String_SumOfAllDigits {
    public static void main(String[] args) {

        System.out.println("SumOfAllDigits = " + SumOfAllDigits("12 java 5 apple 3"));

    }
    public static int SumOfAllDigits(String str){

        int result =0;
        String[] words = str.split(" ");
        for (String word : words) {
           try {
               int number = Integer.parseInt(word);
               result += number;
           }catch (NumberFormatException e){
             //  System.out.println("Ignore if the word is not a valid integer");
           }

        }


        return result;
    }



}

//1  String_SumOfAllDigits
//Write a method that can return the sum of the digits in a string
//Ex:  "12 java 5 apple 3"  ==>  20