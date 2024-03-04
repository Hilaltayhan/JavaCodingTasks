package Havva.week6;

public class String_SumOfAllDigits {


        public static void main(String[] args) {
            String inputString = "12 java 5 apple 3";

           // Using by string_SumOfAllDigits()==>>System.out.println(string_SumOfAllDigits(inputString));

            String[] parts = inputString.split(" ");
            int sum = 0;


            for (String each : parts) {

                if (Character.isDigit(each.charAt(0))){
                    int number = Integer.parseInt(each);// convert string to Integer
                    sum += number;

                }
                //instead of if-block
//                try {
//                    int number = Integer.parseInt(each);// convert string to Integer
//                    sum += number; // Add the number to the sum
//                } catch (NumberFormatException e) {
//                    // each is not an integer, ignore and continue
//                }
            }

            // Print the total sum of the numbers
            System.out.println("The sum of the numbers: " + sum);


        }
        /*
        //Elif' method

        public static int string_SumOfAllDigits(String str){
            int total = 0;
            int currentNumber = 0;
            for (char each : str.toCharArray()) {
                if (Character.isDigit(each)) {
                    currentNumber = currentNumber * 10 + Character.getNumericValue(each);
                } else {
                    total += currentNumber;
                    currentNumber = 0;
                }
            }
            total += currentNumber;
            return total;

        }

         */
    }


