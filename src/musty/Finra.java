package musty;

public class Finra {
    public static void main(String[] args) {
        finra(25);

    }

    public static void finra(int num) {

        for (int i = 0; i < num; i++) {
            if (i % 15 == 0) {
                System.out.println("Finra");
            } else if (i % 5 == 0) {
                System.out.println("Fin");
            } else if (i % 3 == 0) {
                System.out.println("ra");
            } else
                System.out.println(i);


        }
    }
}
