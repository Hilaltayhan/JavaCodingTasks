package hilal.week1;

public class finra {

    public static void main(String[] args) {
        finra(39);

    }

    public static void finra(int number){

        for(int i = 1; i <= number; i++){
            if(i % 15 == 0){ // % 3 and % 5
                System.out.println("FINRA");
            } else if(i % 3 == 0){
                System.out.println("FIN");
            } else if(i % 5 == 0){
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }



    }

