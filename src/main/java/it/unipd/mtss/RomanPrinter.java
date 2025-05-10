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
                "  __  __ ", "  _____  ",  
                "   _____ ", "  _      ", " __   __", " __      __", "  _____ " 
            },
            {
                " |  \\/  |", " |  __ \\ ",  
                "  / ____|", " | |     ", " \\ \\ / /", " \\ \\    / /", " |_   _|"
            },
            {
                " | \\  / |",  " | |  | |",  
                " | |     ", " | |     ", "  \\ V / ", "  \\ \\  / / ", "   | |  "
            },
            {
                " | |\\/| |", " | |  | |", 
                " | |     ", " | |     ", "   > <  ", "   \\ \\/ /  ", "   | |  " 
            },
            {
                " | |  | |", " | |__| |", 
                " | |____ ", " | |____ ", "  / . \\ ", "    \\  /   ", "  _| |_ "
            }, 
            {
                " |_|  |_|", " |_____/ ", 
                "  \\_____|", " |______|", " /_/ \\_\\", "     \\/    ", " |_____|"
            },
        };
        
        for(int z=0; z<6; z++) {
            for (char c : romanNumber.toCharArray()) {
                asciiArt.append(asciiLetters[z]["MDCLXVI".indexOf(c)]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}