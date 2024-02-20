package anila.week1;

public class dividedWithoutNumber {

    public static void divideWithout(int num1, int num2) {

        int result=0;

        while( num1 >= num2 ){
            num1 -= num2;
            result++;

        }
        System.out.println(result);

    }
}
