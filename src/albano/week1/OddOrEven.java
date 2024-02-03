package albano.week1;

public class OddOrEven {

    public static void main(String[] args) {
        oddOrEven(7);
    }

    public static void oddOrEven(int n){
        if (n%2==0){
            System.out.println("The number you entered is even");
        }else {
            System.out.println("The number you entered is odd");
        }
    }
}
