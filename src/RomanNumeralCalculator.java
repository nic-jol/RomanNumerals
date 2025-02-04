public class RomanNumeralCalculator {
    public static final String THOUSANDS_PLACE_SYMBOL = "M";

    public static String determineRomanNumeral(int arabicNumber) {
        return thousandsPlaceNumeral(arabicNumber); //+
//                hundredsPlaceNumbera(arabicNumber) +
//                tensPlaceNumeral(arabicNumber) +
//                onesPlaceNumeral(arabicNumber);
    }

    private static String thousandsPlaceNumeral(int arabicNumber) {
        int thousandsPlace = arabicNumber / 1000;
        return THOUSANDS_PLACE_SYMBOL.repeat(Math.max(0, thousandsPlace));
    }
}
