////////////////////////////////////////////////////////////////////
// GIULIA CREMA 2111945
// ANGELA FAVARO 2111015
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder asciiArt = new StringBuilder();
        String[][] asciiLetters = {
            {
                "  _      ", " __   __", " __      __", "  _____ " 
            },

            {
                " | |     ", " \\ \\ / /", " \\ \\    / /", " |_   _|"
            },

            {
                " | |     ", "  \\ V / ", "  \\ \\  / / ", "   | |  "
            },

            {
                " | |     ", "   > <  ", "   \\ \\/ /  ", "   | |  " 
            },

            {
                " | |____ ", "  / . \\ ", "    \\  /   ", "  _| |_ "
            }, 

            {
                " |______|", " /_/ \\_\\", "     \\/    ", " |_____|"
            },
        };
        
        for(int z=0; z<6; z++) {
            for (char c : romanNumber.toCharArray()) {
                asciiArt.append(asciiLetters[z]["LXVI".indexOf(c)]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}