////////////////////////////////////////////////////////////////////
// GIULIA CREMA 2111945
// ANGELA FAVARO 2111015
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Non valido");
        }

        String[] romanLetters = {"M", "CM", "D", "CD", 
            "C", "XC","L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 
            100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder romanNumber = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                romanNumber.append(romanLetters[i]);
            }
        }

        return romanNumber.toString();
    }
}