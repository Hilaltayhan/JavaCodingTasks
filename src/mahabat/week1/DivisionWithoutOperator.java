package mahabat.week1;

public class DivisionWithoutOperator {


    public static void main(String[] args) {
        System.out.println(divided(4,2));
        System.out.println(divided(6,3));
        System.out.println(divided(8,4));
    }

    public static int divided(int n1,int n2){

        int result=0;

        while (n1 >= n2) {
            n1 -= n2;
            result++;
        }

        return result;
    }
}
