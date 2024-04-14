package elif.week01;

public class OddOrEven {
    public static void main(String[] args) {
        oddEven(87);
    }
    public static void oddEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");

        }else{
            System.out.println("Odd");
        }

    }

}
/*
Explanation
I would write a method that takes an integer parameter num and check If num is divisible by 2 without any remainder or not using an if statement. If it is divisible by 2 without any remainder then it's considered even.
If num is not divisible by 2 without any remainder, it's considered odd.
 */
/*
📌  Java Coding Tasks - Week 1 🥇

1️⃣  Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */

