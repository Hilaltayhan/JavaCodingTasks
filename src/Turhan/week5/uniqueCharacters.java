package Turhan.week5;

import java.util.Scanner;

public class uniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(unique(input.next()));
    }


    public static String unique(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // FIRST WAY
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                unique += ch+"";
            }
          /* OR SECOND WAY
            String check = "";
          int count = 0;
           if (check.contains(ch + "")) {
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                    if (!check.contains(ch + "") && count > 1) {
                        check += ch + "";
                    }
                }

            }
            if (count == 1) {
                unique += ch + "";
            }*/


        }


        return unique;
    }

}
//1️  String_UniqueCharacters
//Write a return  method that can find the unique characters from the String
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";