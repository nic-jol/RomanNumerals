public class RomanNumeralCalculator {
    private static final String THOUSANDS_SYMBOL = "M";

    private static final String HUNDREDS_SYMBOL = "C";
    private static final String FIVE_HUNDRED_SYMBOL = "D";

    private static final String TENS_SYMBOL = "X";
    private static final String FIFTY_SYMBOL = "L";

    private static final String ONES_SYMBOL = "I";
    private static final String FIVE_SYMBOL = "V";

    public static String determineRomanNumeral(int arabicNumber) {
        return thousandsPlaceNumeral(arabicNumber) +
                hundredsPlaceNumeral(arabicNumber) +
                tensPlaceNumeral(arabicNumber) +
                onesPlaceNumeral(arabicNumber);
    }


    private static String thousandsPlaceNumeral(int arabicNumber) {
        int thousandsPlace = arabicNumber / 1000;
        return THOUSANDS_SYMBOL.repeat(Math.max(0, thousandsPlace));
    }

    private static String hundredsPlaceNumeral(int arabicNumber) {
        int hundredsPlace = (arabicNumber % 1000) / 100;

        return baseNumeralCalculator(hundredsPlace,
                HUNDREDS_SYMBOL,
                FIVE_HUNDRED_SYMBOL,
                THOUSANDS_SYMBOL);
    }

    private static String tensPlaceNumeral(int arabicNumber) {
        int tensPlace = (arabicNumber % 100) / 10;

        return baseNumeralCalculator(tensPlace,
                TENS_SYMBOL,
                FIFTY_SYMBOL,
                HUNDREDS_SYMBOL);
    }


    private static String onesPlaceNumeral(int arabicNumber) {
        int onesPlace = arabicNumber % 10;

        return baseNumeralCalculator(onesPlace,
                ONES_SYMBOL,
                FIVE_SYMBOL,
                TENS_SYMBOL);
    }

    private static String baseNumeralCalculator(int arabicNumberPlaceAmount,
                                                String basePlaceSymbol,
                                                String fiveTimesBaseSymbol,
                                                String nextPlaceSymbol) {
        if (arabicNumberPlaceAmount >= 1 && arabicNumberPlaceAmount <= 3) {
            return basePlaceSymbol.repeat(arabicNumberPlaceAmount);
        } else if (arabicNumberPlaceAmount == 4) {
            return basePlaceSymbol + fiveTimesBaseSymbol;
        } else if (arabicNumberPlaceAmount == 5) {
            return fiveTimesBaseSymbol;
        } else if (arabicNumberPlaceAmount >= 6 && arabicNumberPlaceAmount <= 8) {
            return fiveTimesBaseSymbol + basePlaceSymbol.repeat(Math.max(0, arabicNumberPlaceAmount - 5));
        } else if (arabicNumberPlaceAmount == 9) {
            return basePlaceSymbol + nextPlaceSymbol;
        }

        return "";
    }
}
