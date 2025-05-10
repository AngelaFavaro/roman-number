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
    public void testConvertNumeriDa4a6() {
        // Arrange
        int[] inputs = {4, 5, 6};
        String[] expected = {"IV", "V", "VI"};

        // Act & Assert
        for (int i = 0; i < inputs.length; i++) {
            String result = IntegerToRoman.convert(inputs[i]);
            assertEquals(expected[i], result);
        }
    }

    @Test
    public void testConvertNumeriDa7a10() {
        // Arrange
        int[] inputs = {7, 8, 9, 10};
        String[] expected = {"VII", "VIII", "IX", "X"};

        // Act & Assert
        for (int i = 0; i < inputs.length; i++) {
            String result = IntegerToRoman.convert(inputs[i]);
            assertEquals(expected[i], result);
        }
    }

    @Test
    public void testConvertFinoA20() {
        // Arrange
        int[] inputs = {15, 19, 20};
        String[] expected = {"XV", "XIX", "XX"};

        // Act & Assert
        for (int i = 0; i < inputs.length; i++) {
            String result = IntegerToRoman.convert(inputs[i]);
            assertEquals(expected[i], result);
        }
    }

    @Test
    public void testConvertFinoA50() {
        // Arrange
        int[] inputs = {30, 40, 50};
        String[] expected = {"XXX", "XL", "L"};

        // Act & Assert
        for (int i = 0; i < inputs.length; i++) {
            String result = IntegerToRoman.convert(inputs[i]);
            assertEquals(expected[i], result);
        }
    }

     @Test
    public void testConvertiNumeroTroppoGrande() {
        // Arrange
        int input = 51;

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
        String validChars = "LXVI";

        // Act & Assert
        for (int i = 1; i <= 50; i++) {
            String roman = IntegerToRoman.convert(i);
            for (char c : roman.toCharArray()) {
                assertTrue(validChars.indexOf(c) >= 0,
                        "Carattere non valido '" + c + "' trovato nel numero romano: " + roman + " (da " + i + ")");
            }
        }
    }
}