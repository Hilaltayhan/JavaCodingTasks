package Hassan.week4;

    public class FrequencyOfChars {
        public static String frequencyOfChars(String str) {
            StringBuilder result = new StringBuilder();
            int[] frequency = new int[256]; // Assuming ASCII characters

            // Calculate frequencies
            for (char c : str.toCharArray()) {
                frequency[c]++;
            }

            // Construct the result string
            for (int i = 0; i < 256; i++) {
                if (frequency[i] != 0) {
                    result.append((char) i).append(frequency[i]);
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String result = frequencyOfChars("AAABBCDD");
            System.out.println(result);  // Output: A3B2C1D2
        }
    }



