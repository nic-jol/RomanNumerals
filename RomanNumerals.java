import java.util.Scanner;
import java.lang.*;

public class RomanNumerals
{
    /**** ATTRIBUTES ****/
    private int arabicNum;
    private int thousandsPlace;
    private int hundredsPlace;
    private int tensPlace;
    private int onesPlace;
    private String romanNumeral;
    
    /**** CONSTRUCTORS ****/
    public RomanNumerals()
    {
        arabicNum = 0;
        thousandsPlace = 0;
        hundredsPlace = 0;
        tensPlace = 0;
        onesPlace = 0;
        romanNumeral = "";       
    }
    
    //METHODS
    /**** Set Methods ****/    
    public void setIntegers()
    {
        // Get arabic number from user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to convert to Roman Numerals");
        System.out.print("(Number should be between 1 and 9999): ");
        String userInput = keyboard.nextLine();
        
        // Analyze input
        int inputLength = userInput.length();
        if ((inputLength > 0) && (inputLength < 5))
        {
            for(int i = 0; i < inputLength; i++)
            {
                char nextCharacter = userInput.charAt(i);
                if (Character.isDigit(nextCharacter) == false)
                {
                    // Make a method for this later
                    System.out.println("Sorry! That's not quite right.");
                    System.exit(0);
                }
            }
        }
        else
        {
            System.out.println("Sorry! That's not quite right.");
            System.exit(0);            
        }
        // Set original number
        arabicNum = Integer.parseInt(userInput);
        
        // Get the places
        setPlaces(inputLength);
    }
    
    private void setPlaces(int numLength)
    {
        switch (numLength)
        {
        case 4:
            thousandsPlace = arabicNum / 1000;
            hundredsPlace = (arabicNum - (1000 * thousandsPlace)) / 100;
            tensPlace = (arabicNum - ((1000 * thousandsPlace) + (100 * hundredsPlace))) / 10;
            onesPlace = arabicNum % 10;
            break;
        case 3:
            hundredsPlace = arabicNum / 100;
            tensPlace = (arabicNum - (100 * hundredsPlace)) /10;
            onesPlace = arabicNum % 10;
            break;
        case 2:
            tensPlace = arabicNum / 10;
            onesPlace = arabicNum % 10;
            break;
        default:
            onesPlace = arabicNum % 10;
            break;     
        }
    }
    
    /**** Get Methods ****/
    public int getArabicNum()
    {
        return arabicNum;
    }
    
    public int getThousands()
    {
        return thousandsPlace;
    }
  
    public int getHundreds()
    {
        return hundredsPlace;
    }
    
    public int getTens()
    {
        return tensPlace;
    }
 
    public int getOnes()
    {
        return onesPlace;
    }
    
    public String getRomanNumeral()
    {
        return romanNumeral;
    }
    
    /**** Operational Methods ****/
    public String createRomanNum()
    {
		if (thousandsPlace > 0)
			romNumThousands();
	    if (hundredsPlace > 0)
	        romNumHundreds();
	    if (tensPlace > 0)
            romNumTens();
	    if (onesPlace > 0)
	        romNumOnes();
	    return romanNumeral;
	}
	
	private void romNumThousands()
	{
		for (int i = thousandsPlace; i > 0; i--)
		    romanNumeral = romanNumeral + "M";
    }
    
    private void romNumHundreds()
    {
		String symbol = "C";
		
		int div5Rem = hundredsPlace % 5;
		
		if (hundredsPlace >= 1 && hundredsPlace <= 3)
		{
			romanNumeral = romanNumeral + remainder123(symbol, hundredsPlace);
	    }
	    else if (hundredsPlace == 4)
	    {
			romanNumeral = romanNumeral + "CD";
		}
		else if (hundredsPlace >= 5 && hundredsPlace <= 8)
		{
			romanNumeral = romanNumeral + "D" + remainder123(symbol, div5Rem);
		}
		else
		{
			romanNumeral = romanNumeral + "CM";
		}
    }
    
    private void romNumTens()
    {
		String symbol = "X";
		
		int div5Rem = tensPlace % 5;
		
		if (tensPlace >= 1 && tensPlace <= 3)
		{
			romanNumeral = romanNumeral + remainder123(symbol, tensPlace);
	    }
	    else if (tensPlace == 4)
	    {
			romanNumeral = romanNumeral + "XL";
		}
		else if (tensPlace >= 5 && tensPlace <= 8)
		{
			romanNumeral = romanNumeral + "L" + remainder123(symbol, div5Rem);
		}
		else
		{
			romanNumeral = romanNumeral + "XC";
		}
    }

    private void romNumOnes()
    {
		String symbol = "I";
		
		int div5Rem = onesPlace % 5;
		
		if (onesPlace >= 1 && onesPlace <= 3)
		{
			romanNumeral = romanNumeral + remainder123(symbol, onesPlace);
	    }
	    else if (onesPlace == 4)
	    {
			romanNumeral = romanNumeral + "IV";
		}
		else if (onesPlace >= 5 && onesPlace <= 8)
		{
			romanNumeral = romanNumeral + "V" + remainder123(symbol, div5Rem);
		}
		else
		{
			romanNumeral = romanNumeral + "IX";
		}
    }
    
    private String remainder123(String symbol, int iterations)
    {
		String addition = "";
		for (int i = iterations; i > 0; i--)
		{
			addition = addition + symbol;
		}
		
		return addition;
	}		
		
}
