public class RomanNumeralCalculator {
    public static final String THOUSANDS_SYMBOL = "M";
    public static final String HUNDREDS_SYMBOL = "C";
    private static final String FIVE_HUNDRED_SYMBOL = "D";
    public static final String TENS_SYMBOL = "X";
    public static final String FIFTY_SYMBOL = "L";

    public static String determineRomanNumeral(int arabicNumber) {
        return thousandsPlaceNumeral(arabicNumber) +
                hundredsPlaceNumeral(arabicNumber) +
                tensPlaceNumeral(arabicNumber); //+
//                onesPlaceNumeral(arabicNumber);
    }

    private static String tensPlaceNumeral(int arabicNumber) {
        int hundredsPlace = (arabicNumber % 100) / 10;

        if (hundredsPlace >= 1 && hundredsPlace <= 3) {
            return TENS_SYMBOL.repeat(Math.max(0, hundredsPlace));
        } else if (hundredsPlace == 4) {
            return TENS_SYMBOL + FIFTY_SYMBOL;
        } else if (hundredsPlace == 5) {
            return FIFTY_SYMBOL;
        } else if (hundredsPlace >= 6 && hundredsPlace <= 8) {
            return FIFTY_SYMBOL + TENS_SYMBOL.repeat(Math.max(0, hundredsPlace - 5));
        } else if (hundredsPlace == 9) {
            return TENS_SYMBOL + HUNDREDS_SYMBOL;
        }

        return "";
    }

    private static String hundredsPlaceNumeral(int arabicNumber) {
        int hundredsPlace = (arabicNumber % 1000) / 100;

        if (hundredsPlace >= 1 && hundredsPlace <= 3) {
            return HUNDREDS_SYMBOL.repeat(hundredsPlace);
        } else if (hundredsPlace == 4) {
            return HUNDREDS_SYMBOL + FIVE_HUNDRED_SYMBOL;
        } else if (hundredsPlace == 5) {
            return FIVE_HUNDRED_SYMBOL;
        } else if (hundredsPlace >= 6 && hundredsPlace <= 8) {
            return FIVE_HUNDRED_SYMBOL + HUNDREDS_SYMBOL.repeat(Math.max(0, hundredsPlace - 5));
        } else if (hundredsPlace == 9) {
            return HUNDREDS_SYMBOL + THOUSANDS_SYMBOL;
        }

        return "";
    }

    private static String thousandsPlaceNumeral(int arabicNumber) {
        int thousandsPlace = arabicNumber / 1000;
        return THOUSANDS_SYMBOL.repeat(Math.max(0, thousandsPlace));
    }
}
