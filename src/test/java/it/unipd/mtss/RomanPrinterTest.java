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
    public void testPrintNumeriFinoA6() {
        // Arrange
        int[] inputs = {4, 5, 6};
        String[] expectedOutputs = {
            "  _____  __      __\n |_   _| \\ \\    / /\n   | |    \\ \\  / / \n   | |     \\ \\/ /  \n  _| |_     \\  /   \n |_____|     \\/    \n",
            " __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n",
            " __      __  _____ \n \\ \\    / / |_   _|\n  \\ \\  / /    | |  \n   \\ \\/ /     | |  \n    \\  /     _| |_ \n     \\/     |_____|\n",
        };

        // Act & Assert
        for (int i = 0; i < inputs.length; i++) {
            String result = RomanPrinter.print(inputs[i]);
            assertEquals(expectedOutputs[i], result);
        }
    }

    @Test
    public void testPrintNumeriFinoA10() {
        // Arrange
        int[] inputs = {7, 8, 9, 10};
        String[] expectedOutputs = {
            " __      __  _____   _____ \n \\ \\    / / |_   _| |_   _|\n  \\ \\  / /    | |     | |  \n   \\ \\/ /     | |     | |  \n    \\  /     _| |_   _| |_ \n     \\/     |_____| |_____|\n",
            " __      __  _____   _____   _____ \n \\ \\    / / |_   _| |_   _| |_   _|\n  \\ \\  / /    | |     | |     | |  \n   \\ \\/ /     | |     | |     | |  \n    \\  /     _| |_   _| |_   _| |_ \n     \\/     |_____| |_____| |_____|\n",
            "  _____  __   __\n |_   _| \\ \\ / /\n   | |    \\ V / \n   | |     > <  \n  _| |_   / . \\ \n |_____| /_/ \\_\\\n",
            " __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n"
        };

        // Act & Assert
        for (int i = 0; i < inputs.length; i++) {
            String result = RomanPrinter.print(inputs[i]);
            assertEquals(expectedOutputs[i], result);
        }
    }

    @Test
    public void testPrintNumeriFinoA20() {
        // Arrange
        int[] inputs = {15, 19, 20};
        String[] expected = {
            " __   __ __      __\n \\ \\ / / \\ \\    / /\n  \\ V /   \\ \\  / / \n   > <     \\ \\/ /  \n  / . \\     \\  /   \n /_/ \\_\\     \\/    \n",
            " __   __  _____  __   __\n \\ \\ / / |_   _| \\ \\ / /\n  \\ V /    | |    \\ V / \n   > <     | |     > <  \n  / . \\   _| |_   / . \\ \n /_/ \\_\\ |_____| /_/ \\_\\\n",
            " __   __ __   __\n \\ \\ / / \\ \\ / /\n  \\ V /   \\ V / \n   > <     > <  \n  / . \\   / . \\ \n /_/ \\_\\ /_/ \\_\\\n",
        };

        // Act & Assert
        for (int i = 0; i < inputs.length; i++) {
            String result = RomanPrinter.print(inputs[i]);
            assertEquals(expected[i], result);
        }
    }

    @Test
    public void testPrintNumeriFinoA50() {
        // Arrange
        int[] inputs = {30, 40, 50};
        String[] expected = {
            " __   __ __   __ __   __\n \\ \\ / / \\ \\ / / \\ \\ / /\n  \\ V /   \\ V /   \\ V / \n   > <     > <     > <  \n  / . \\   / . \\   / . \\ \n /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n",
            " __   __  _      \n \\ \\ / / | |     \n  \\ V /  | |     \n   > <   | |     \n  / . \\  | |____ \n /_/ \\_\\ |______|\n",
            "  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n",
        };

        // Act & Assert
        for (int i = 0; i < inputs.length; i++) {
            String result = RomanPrinter.print(inputs[i]);
            assertEquals(expected[i], result);
        }
    }

    @Test
    public void testPrintNumeriFinoA100() {
        // Arrange
        int[] inputs = {60, 70, 80, 90, 100};
        String[] expected = {
            "  _       __   __\n | |      \\ \\ / /\n | |       \\ V / \n | |        > <  \n | |____   / . \\ \n |______| /_/ \\_\\\n",
            "  _       __   __ __   __\n | |      \\ \\ / / \\ \\ / /\n | |       \\ V /   \\ V / \n | |        > <     > <  \n | |____   / . \\   / . \\ \n |______| /_/ \\_\\ /_/ \\_\\\n",
            "  _       __   __ __   __ __   __\n | |      \\ \\ / / \\ \\ / / \\ \\ / /\n | |       \\ V /   \\ V /   \\ V / \n | |        > <     > <     > <  \n | |____   / . \\   / . \\   / . \\ \n |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n",
            " __   __   _____ \n \\ \\ / /  / ____|\n  \\ V /  | |     \n   > <   | |     \n  / . \\  | |____ \n /_/ \\_\\  \\_____|\n",
            "   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n"
        };

        // Act & Assert
        for (int i = 0; i < inputs.length; i++) {
            String result = RomanPrinter.print(inputs[i]);
            assertEquals(expected[i], result);
        }
    }

    @Test
    public void testPrintNumeriFinoA500() {
        // Arrange
        int[] inputs = {200, 300, 400, 500};
        String[] expected = {
            "   _____    _____ \n  / ____|  / ____|\n | |      | |     \n | |      | |     \n | |____  | |____ \n  \\_____|  \\_____|\n",
            "   _____    _____    _____ \n  / ____|  / ____|  / ____|\n | |      | |      | |     \n | |      | |      | |     \n | |____  | |____  | |____ \n  \\_____|  \\_____|  \\_____|\n",
            "   _____   _____  \n  / ____| |  __ \\ \n | |      | |  | |\n | |      | |  | |\n | |____  | |__| |\n  \\_____| |_____/ \n",
            "  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ \n"
        };

        // Act & Assert
        for (int i = 0; i < inputs.length; i++) {
            String result = RomanPrinter.print(inputs[i]);
            assertEquals(expected[i], result);
        }
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
        int invalidInput = 501;

        // Act & Assert
        Exception e = assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(invalidInput));
        assertEquals("Non valido", e.getMessage());
    }
}