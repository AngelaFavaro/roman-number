package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntegerToRomanInputVerify {

    @Test
    public void testRomanOutputContainsOnlyValidCharacters() {
        // Arrange
        String validChars = "MDCLXVI";

        // Act & Assert
        for (int i = 1; i <= 1000; i++) {
            String roman = IntegerToRoman.convert(i);

            for (char c : roman.toCharArray()) {
                // Assert
                assertTrue(validChars.indexOf(c) >= 0,
                        "Invalid character '" + c + "' found in Roman numeral: " + roman + " (from number " + i + ")");
            }
        }
    }
}