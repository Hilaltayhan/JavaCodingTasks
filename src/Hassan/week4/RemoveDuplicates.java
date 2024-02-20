package Hassan.week4;



    public class RemoveDuplicates {
        public static String removeDup(String str) {
            StringBuilder result = new StringBuilder();

            // Add the first character of the string to the result
            result.append(str.charAt(0));

            // Iterate through the string, adding characters to the result if they are different from the previous one
            for (int i = 1; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                char prevChar = str.charAt(i - 1);
                if (currentChar != prevChar) {
                    result.append(currentChar);
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            System.out.println(removeDup("AAABBBCCC"));  // Output: ABC
        }
    }


