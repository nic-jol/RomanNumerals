import java.util.Scanner;

public class RomanNumerals {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while(true) {
            System.out.println("\nEnter a number to convert to Roman Numerals (Ctrl + C to exit)");
            System.out.print("Number should be between 1 and 9999: ");
            String userInput = keyboard.nextLine();


            int arabicNumber = parseInputtedNumber(userInput);
            String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(arabicNumber);

            if (!romanNumeral.trim().isEmpty()) {
                System.out.printf("Roman Numeral: %s%n", romanNumeral);
            }
        }

    }

    private static int parseInputtedNumber(String userInput) {
        if (userInput != null &&
                !userInput.isEmpty() &&
                userInput.length() < 5) {
            int parseInteger;
            try {
                parseInteger = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                errorResult();
                return -1;
            }

            if (parseInteger < 1) {
                errorResult();
                return -1;
            }


            return parseInteger;
        } else {
            errorResult();
        }
        return 0;
    }

    private static void errorResult() {
        System.out.println("Sorry! That's not quite right.");
    }
}
