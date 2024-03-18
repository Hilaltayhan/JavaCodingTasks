package musty.week1;

public class oddOrEven {
    public static void main(String[] args) {
        number(50);
    }
    public static void number(int num){

        if (num % 2 == 0){
            System.out.println(num + " is even number");
        }else System.out.println(num + " is odd number");
    }
}
/*
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */