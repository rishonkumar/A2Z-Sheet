package Contest_334;

public class DivisibilityArrayString {

    public int[] divisibilityArray(String word, int m) {

        int size = word.length();
        int[] result = new int[size];
        long rem = 0;
        for (int i = 0; i < size; i++) {
            //get the current digit
            int digit = word.charAt(i) - '0';
            //check if remainder of current digit is 0 if yes then add "1" in ans
            /*
                if no is 993 and next number is 9934
                you cal prefix by 993*10+4
             */
            rem = rem * 10 + digit;
            rem %= m;
            if (rem == 0) result[i] = 1;

        }
        return result;
    }

}
