package Havva.week1;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(  identify(28));

    }
    public static String identify(int number){
        if(number%2==0)   return "Even";
         return "Odd";
    }
}
