package nilYuce.week1;

public class DivisionWithoutOperator {

    public static void main(String[] args) {


        System.out.println(DivisionWithoutOperator(15,2));
        System.out.println(DivisionWithoutOperator(25,6));
        System.out.println(DivisionWithoutOperator(100,6));


    }

    public static int DivisionWithoutOperator(int n1, int n2) {

        int count = 0;


        while (n1 >= n2) {
            n1 -= n2;
            count++;
        }

        return count;

    }


}

/*

     **Divide without / operator**
     Write a method that can divide two numbers without using division operator.
*/


