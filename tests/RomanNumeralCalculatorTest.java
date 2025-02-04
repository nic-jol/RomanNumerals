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

    @Test
    void determineRomanNumeral_1900_returnsMCM() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(1900);

        assertEquals("MCM", romanNumeral);
    }

    @Test
    void determineRomanNumeral_2400_returnsMMCD() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(2400);

        assertEquals("MMCD", romanNumeral);
    }

    @Test
    void determineRomanNumeral_10_returnsX() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(10);

        assertEquals("X", romanNumeral);
    }

    @Test
    void determineRomanNumeral_20_returnsXX() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(20);

        assertEquals("XX", romanNumeral);
    }

    @Test
    void determineRomanNumeral_30_returnsXXX() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(30);

        assertEquals("XXX", romanNumeral);
    }

    @Test
    void determineRomanNumeral_40_returnsXL() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(40);

        assertEquals("XL", romanNumeral);
    }

    @Test
    void determineRomanNumeral_50_returnsL() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(50);

        assertEquals("L", romanNumeral);
    }

    @Test
    void determineRomanNumeral_60_returnsLX() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(60);

        assertEquals("LX", romanNumeral);
    }

    @Test
    void determineRomanNumeral_70_returnsLXX() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(70);

        assertEquals("LXX", romanNumeral);
    }

    @Test
    void determineRomanNumeral_80_returnsLXXX() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(80);

        assertEquals("LXXX", romanNumeral);
    }

    @Test
    void determineRomanNumeral_90_returnsXC() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(90);

        assertEquals("XC", romanNumeral);
    }

    @Test
    void determineRomanNumeral_1990_returnsMCM() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(1990);

        assertEquals("MCMXC", romanNumeral);
    }

    @Test
    void determineRomanNumeral_2430_returnsMMCDXXX() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(2430);

        assertEquals("MMCDXXX", romanNumeral);
    }

    @Test
    void determineRomanNumeral_1_returnsI() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(1);

        assertEquals("I", romanNumeral);
    }

    @Test
    void determineRomanNumeral_2_returnsII() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(2);

        assertEquals("II", romanNumeral);
    }

    @Test
    void determineRomanNumeral_3_returnsIII() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(3);

        assertEquals("III", romanNumeral);
    }

    @Test
    void determineRomanNumeral_4_returnsIV() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(4);

        assertEquals("IV", romanNumeral);
    }

    @Test
    void determineRomanNumeral_5_returnsV() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(5);

        assertEquals("V", romanNumeral);
    }

    @Test
    void determineRomanNumeral_6_returnsVI() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(6);

        assertEquals("VI", romanNumeral);
    }

    @Test
    void determineRomanNumeral_7_returnsVII() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(7);

        assertEquals("VII", romanNumeral);
    }

    @Test
    void determineRomanNumeral_8_returnsVIII() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(8);

        assertEquals("VIII", romanNumeral);
    }

    @Test
    void determineRomanNumeral_9_returnsIX() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(9);

        assertEquals("IX", romanNumeral);
    }

    @Test
    void determineRomanNumeral_9426_returnsMMMMMMMMMCDXXVI() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(9426);

        assertEquals("MMMMMMMMMCDXXVI", romanNumeral);
    }

    @Test
    void determineRomanNumeral_2006_returnsMMVI() {
        String romanNumeral = RomanNumeralCalculator.determineRomanNumeral(2006);

        assertEquals("MMVI", romanNumeral);
    }

}
