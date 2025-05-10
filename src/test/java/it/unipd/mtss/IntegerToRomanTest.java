package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvertNumeriDa1a3() {
        // Arrange
        int input1 = 1, input2 = 2, input3 = 3;

        // Act
        String result1 = IntegerToRoman.convert(input1);
        String result2 = IntegerToRoman.convert(input2);
        String result3 = IntegerToRoman.convert(input3);

        // Assert
        assertEquals("I", result1);
        assertEquals("II", result2);
        assertEquals("III", result3);
    }

     @Test
    public void testConvertiNumeroTroppoGrande() {
        // Arrange
        int input = 4;

        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(input);
        });

        assertEquals("Non valido", exception.getMessage());
    }

    @Test
    public void testConvertiZero() {
        // Arrange
        int input = 0;

        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(input);
        });

        assertEquals("Non valido", exception.getMessage());
    }

    @Test
    public void testRomanOutputContainsOnlyValidCharacters() {
        // Arrange
        String validChars = "I";

        // Act & Assert
        for (int i = 1; i <= 3; i++) {
            String roman = IntegerToRoman.convert(i);
            for (char c : roman.toCharArray()) {
                assertTrue(validChars.indexOf(c) >= 0,
                        "Carattere non valido '" + c + "' trovato nel numero romano: " + roman + " (da " + i + ")");
            }
        }
    }
}