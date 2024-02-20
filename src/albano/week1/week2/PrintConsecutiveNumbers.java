package albano.week1.week2;

public class PrintConsecutiveNumbers {
    public static void main(String[] args) {

        printConsecutiveNumbers(100);
    }

    public static void printConsecutiveNumbers(int num){
        for (int i = 1; i <= num; i++) {

            if(i%2==0 && i%3==0 && i%5==0){
                System.out.println("CodilityTestCoders");
                continue;
            } else if (i%2==0 && i%3==0) {
                System.out.println("CodilityTest");
                continue;
            }
            System.out.println(i);
        }
    }
}
