import java.util.Scanner;

public class RomanNumerals2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to convert to Roman Numerals");
        System.out.print("(Number should be between 1 and 3999): ");
        String userInput = keyboard.nextLine();

        int arabicNumber = parseInputtedNumber(userInput);
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(arabicNumber);
    }

    private static int parseInputtedNumber(String userInput) {
        if (userInput != null &&
                !userInput.isEmpty() &&
                userInput.length() < 5) {
            int parseInteger = 0;
            try {
                parseInteger = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                errorExit();
            }
            return parseInteger;
        } else {
            errorExit();
        }
        return 0;
    }

    private static void errorExit() {
        System.out.println("Sorry! That's not quite right.");
        System.exit(1);
    }

}
