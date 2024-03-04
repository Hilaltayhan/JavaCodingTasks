package elif.week6;

public class SumOfAllDigits {
    public static void main(String[] args) {
        String str = "5 java 15 apple 30";
        int total = 0;
        int currentNumber = 0;
        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(each);
                //  currentNumber = 0 * 10 + 5; =5
                // total = 5
                //current number = 0
                //current number = 0 * 10 + 1; = 1
                //current number = 1 * 10 + 5; = 15 ( sonraki digit sayidan baska bir sey olmadigi icin else blogunba gitmiyor ve currentnumber sifirlanmiyor.
                // buradan sonra sayi olmadigi icin else blogu devreye giriyor current numberin numeric value su totale ekleniyor. ve current number sifirlaniyor
                // son sayiya gelindiginde
                //current number= 0*10+3; = 3
                //current number= 3*10+0; = 30
                // son olarak 30 da totale ekleniyor.ve loop bitiyor.
            } else {
                total += currentNumber;
                currentNumber = 0;
            }
        }
        total += currentNumber;
        System.out.println(total);
    }
}
/*
Explanation
for loopla str nin her karakterinin digit olup olmadigini kontrol ediyorum.
her bir karakter each e ataniyor. digit ise asagidaki islem yapiliyor.
 current number sifir, 10 ile carpip ve karakterin degerini ekliyorum.
 eger sonraki karakter de sayis ise ayni islemi o karakter icinde uyguluyorum.
 ve en sonda sonraki karakter sayi olmayinca current numberda gecici olarak tutulan rakamlarin numeric value su totale ekleniyor.
sonra current numberi tekrar 0 a esitliyorum.
eger karakter digit degilse geciyorum.

 */
/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */