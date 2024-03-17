package Turhan.week4;

import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some text:");

        System.out.println(removeDup(input.next()));

    }

    public static String removeDup(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!result.contains(ch+"")){
                result += ch+"";
            }
        }
        return result;
    }
}
//String - Remove Duplicates
//Write a return method that can remove the duplicated values from the String
//  Ex: removeDup("AAABBBCCC") ==> ABC