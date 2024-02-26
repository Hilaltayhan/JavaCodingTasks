package Turhan.week5;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(reverseString(input.next()));

    }
    public static String reverseString(String str){
        String result="";

        for (int i = str.length()-1; i >= 0; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
}

//2️  String_Reverse
//Write a return method that can reverse  String
//Ex: Reverse("ABCD"); ==> DCBA