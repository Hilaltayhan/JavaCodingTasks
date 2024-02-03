package albano.week1;

public class DivisionWithOutOperator {


    public static int divided(int n1,int n2){

        int result=0;

        while (n1 >= n2) {
            n1 -= n2;
            result++;
        }

        return result;
    }
}
