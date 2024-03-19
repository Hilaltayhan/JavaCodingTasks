package anila.week3;

public class ReverseNegativeNumber {
    static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num < 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    // Driver code
    public static void main(String[] args)
    {
        int num = -35;
        System.out.println("Reverse of no. is "
                + reverseDigits(num));
    }

}
/*
Write  return method that can reverse digits of  negative number and return it as int
input: -35  output -53
 */
