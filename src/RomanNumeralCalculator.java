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
        int hundredsPlace = (arabicNumber % 100) / 10;

        return baseNumeralCalculator(hundredsPlace,
                TENS_SYMBOL,
                FIFTY_SYMBOL,
                HUNDREDS_SYMBOL);
    }

    private static String baseNumeralCalculator(int hundredsPlace,
                                                String basePlaceSymbol,
                                                String fiveTimesBaseSymbol,
                                                String nextPlaceSymbol) {
        if (hundredsPlace >= 1 && hundredsPlace <= 3) {
            return basePlaceSymbol.repeat(hundredsPlace);
        } else if (hundredsPlace == 4) {
            return basePlaceSymbol + fiveTimesBaseSymbol;
        } else if (hundredsPlace == 5) {
            return fiveTimesBaseSymbol;
        } else if (hundredsPlace >= 6 && hundredsPlace <= 8) {
            return fiveTimesBaseSymbol + basePlaceSymbol.repeat(Math.max(0, hundredsPlace - 5));
        } else if (hundredsPlace == 9) {
            return basePlaceSymbol + nextPlaceSymbol;
        }

        return "";
    }
}
