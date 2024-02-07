package nilYuce.week2;

public class ConsecutiveNumbers {


    public static void main(String[] args) {
        int num = 45;
        Numbers(num);

    }

    public static void Numbers(int number) {

        int j = 1;
        while (j <= number) {
            String result = "";
            if (j % 2 == 0) result += "Codility";
            if (j % 3 == 0) result += "Test";
            if (j % 5 == 0) result += "Coders ";
            if (result.isEmpty())
                System.out.println(j);
            else
                System.out.println(result);
            j++;
        }
    }
}
/*

**Print Consecutive Numbers**
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N,
each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility,
Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5,
it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
EX:
Numbers divisible by both 2 and 3 should be replaced by CodilityTest and
numbers divisible by all three numbers, 2,3 and 5, should be replaced by CodilityTestCoders.
 */