////////////////////////////////////////////////////////////////////
// GIULIA CREMA 2111945
// ANGELA FAVARO 2111015
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 20) {
            throw new IllegalArgumentException("Non valido");
        }

        String[] romanLetters = {"X", "IX", "V", "IV", "I"};
        int[] values = {10, 9, 5, 4, 1};

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