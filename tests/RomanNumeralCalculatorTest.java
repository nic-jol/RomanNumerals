import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralCalculatorTest {
    @Test
    void determineRomanNumeral_1000_returnsM() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(1000);

        assertEquals("M", romanNumeral);
    }

    @Test
    void determineRomanNumeral_2000_returnsMM() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(2000);

        assertEquals("MM", romanNumeral);
    }

    @Test
    void determineRomanNumeral_3000_returnsMMM() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(3000);

        assertEquals("MMM", romanNumeral);
    }

    @Test
    void determineRomanNumeral_4000_returnsMMM() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(4000);

        assertEquals("MMMM", romanNumeral);
    }

    @Test
    void determineRomanNumeral_10000_returnsMMMMMMMMMM() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(10000);

        assertEquals("MMMMMMMMMM", romanNumeral);
    }


    @Test
    void determineRomanNumeral_100_returnsC() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(100);

        assertEquals("C", romanNumeral);
    }

    @Test
    void determineRomanNumeral_200_returnsCC() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(200);

        assertEquals("CC", romanNumeral);
    }

    @Test
    void determineRomanNumeral_300_returnsCCC() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(300);

        assertEquals("CCC", romanNumeral);
    }
    @Test
    void determineRomanNumeral_400_returnsCD() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(400);

        assertEquals("CD", romanNumeral);
    }
    @Test
    void determineRomanNumeral_500_returnsD() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(500);

        assertEquals("D", romanNumeral);
    }
    @Test
    void determineRomanNumeral_600_returnsDC() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(600);

        assertEquals("DC", romanNumeral);
    }
    @Test
    void determineRomanNumeral_700_returnsDCC() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(700);

        assertEquals("DCC", romanNumeral);
    }
    @Test
    void determineRomanNumeral_800_returnsDCCC() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(800);

        assertEquals("DCCC", romanNumeral);
    }
    @Test
    void determineRomanNumeral_900_returnsCM() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(900);

        assertEquals("CM", romanNumeral);
    }


}
