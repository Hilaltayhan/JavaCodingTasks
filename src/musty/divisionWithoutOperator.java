package musty;

public class divisionWithoutOperator {
    public static void main(String[] args) {

        divide(8,2);
    }

    public static void divide(int n1,int n2){
        if (n2 == 0){
            System.err.println("Cannot divide by zero");
        return;
        }
        int count = 0;
        String result = n1 + " /" + n2 + " is ";

        while (n1 <= n2){
            count++;
            n1-=n2;
        }
        System.out.println(result + count + " with remainder " + n1);
    }
}
