package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

    @Test
    public void testPrintNumeriSemplici() {
        // Arrange
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        // Act
        String output1 = RomanPrinter.print(num1);
        String output2 = RomanPrinter.print(num2);
        String output3 = RomanPrinter.print(num3);

        // Assert
        assertEquals("  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n", output1);
        assertEquals("  _____   _____ \n |_   _| |_   _|\n   | |     | |  \n   | |     | |  \n  _| |_   _| |_ \n |_____| |_____|\n", output2);
        assertEquals("  _____   _____   _____ \n |_   _| |_   _| |_   _|\n   | |     | |     | |  \n   | |     | |     | |  \n  _| |_   _| |_   _| |_ \n |_____| |_____| |_____|\n", output3);
    }

    @Test
    public void testNumeroTroppoPiccolo() {
        // Arrange
        int invalidInput = 0;

        // Act & Assert
        Exception e = assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(invalidInput));
        assertEquals("Non valido", e.getMessage());
    }

    @Test
    public void testNumeroTroppoGrande() {
        // Arrange
        int invalidInput = 4;

        // Act & Assert
        Exception e = assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(invalidInput));
        assertEquals("Non valido", e.getMessage());
    }
}