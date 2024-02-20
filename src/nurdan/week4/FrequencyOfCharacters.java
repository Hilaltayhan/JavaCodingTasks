package nurdan.week4;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCDD";

        String result = "";

        for (String each : str.split("")) {

            int frequency = Collections.frequency( Arrays.asList(str.split("")), each);

            if(!result.contains(each)){
                result += each + frequency;
            }

        }
        System.out.println(result);
    }
}


/*
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */