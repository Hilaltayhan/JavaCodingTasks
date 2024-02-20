package Turhan.week4;

public class sameLetters {
    public static void main(String[] args) {
        System.out.println(sameLetter("abc", "cab"));
        System.out.println(sameLetter("abd", "cab"));
        System.out.println(sameLetter("abd", "cad"));
    }

    public static boolean sameLetter (String word_1, String word_2){
        int conut = 0;
        for (int i = 0; i < word_1.length(); i++) {
            char chr = word_1.charAt(i);
            if(word_2.contains(chr + "")){
                conut++;
            }
        }

        if (word_2.length() == conut){
            return true;
        }



        return false;
    }

}
//Write a return method that checks if a string is built out of the same letters as another string.
//  Ex: same("abc", "cab"); ==> true
//      same("abc", "abb"); ==> false