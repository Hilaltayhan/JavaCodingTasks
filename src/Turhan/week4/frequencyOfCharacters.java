package Turhan.week4;

import java.util.Scanner;

public class frequencyOfCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
            if(str.charAt(j) == ch){
                count++;

            }

            }
            if(!result.contains(ch+"")){
                result += (ch+"")+count;
            }

        }

        System.out.println(result);
    }
}
//1️⃣  String - Frequency of Characters
//Write a return method that can find the frequency of characters
//  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2