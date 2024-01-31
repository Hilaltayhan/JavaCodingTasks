package elif.week1;

public class divisionWithoutOperator {

    public static void divideWithout(int num1, int num2) {

        int result=0;

        while( num1 >= num2 ){
            num1 -= num2;
            result++;

        }
        System.out.println(result);

    }
}
/*
Explanation
I would write a method that simulates the division process by repeatedly subtracting num2 from num1 until num1 becomes less than num2, and count the number of subtractions along the way.
So to do this I would start by initializing a variable result to store the result of the division.
Enter a while loop that continues as long as num1 is greater than or equal to num2.
Inside the loop, subtract num2 from num1 and increment the result by 1 in each iteration.
Once num1 becomes less than num2, the loop exits.

 */
/*
2️⃣  Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */