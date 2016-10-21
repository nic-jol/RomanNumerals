import java.util.Scanner;
import java.lang.*;

public class RomanNumerals
{
    /**** ATTRIBUTES ****/
    private int arabicNum;
    private int thousandsPlaceArabic;
    private int hundredsPlaceArabic;
    private int tensPlaceArabic;
    private int onesPlaceArabic;
    
    private String romanNumeral;
    private String thousandsPlaceRoman;
    private String hundredsPlaceRoman;
    private String tensPlaceRoman;
    private String onesPlaceRoman;
    
    /**** CONSTRUCTORS ****/
    public RomanNumerals()
    {
        arabicNum = 0;
        thousandsPlaceArabic = 0;
        hundredsPlaceArabic = 0;
        tensPlaceArabic = 0;
        onesPlaceArabic = 0;
        
        romanNumeral = "";
        thousandsPlaceRoman = "";
        hundredsPlaceRoman = "";
        tensPlaceRoman = "";
        onesPlaceRoman = "";
    }
    
    //METHODS
    /**** Set Methods ****/    
    public void setIntegers()
    {
        // Get arabic number from user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to convert to Roman Numerals");
        System.out.print("(Number should be between 1 and 3999): ");
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
        if (arabicNum > 3999)
        {
            System.out.println("Sorry! That's not quite right.");
            System.exit(0);
        }
            
        switch (numLength)
        {
        case 4:
            thousandsPlaceArabic = arabicNum / 1000;
            hundredsPlaceArabic = (arabicNum - (1000 * thousandsPlaceArabic)) / 100;
            tensPlaceArabic = (arabicNum - ((1000 * thousandsPlaceArabic) + (100 * hundredsPlaceArabic))) / 10;
            onesPlaceArabic = arabicNum % 10;
            break;
        case 3:
            hundredsPlaceArabic = arabicNum / 100;
            tensPlaceArabic = (arabicNum - (100 * hundredsPlaceArabic)) /10;
            onesPlaceArabic = arabicNum % 10;
            break;
        case 2:
            tensPlaceArabic = arabicNum / 10;
            onesPlaceArabic = arabicNum % 10;
            break;
        default:
            onesPlaceArabic = arabicNum % 10;
            break;     
        }
    }
    
    public void setArabicNumber(int newAN)
    {
        arabicNum = newAN;
    }
    public void setOnes(int newOnes)
    {
        onesPlaceArabic = newOnes;
    }
    
    public void setTens(int newTens)
    {
        tensPlaceArabic = newTens;
    }
    
    public void setHundreds(int newHundreds)
    {
        hundredsPlaceArabic = newHundreds;
    }

    public void setThousands(int newThousands)
    {
        thousandsPlaceArabic = newThousands;
    }
    
    public void setRomanNumeral (String newRN)
    {
        romanNumeral = newRN;
    }
    
    
    /**** Get Methods ****/
    public int getArabicNum()
    {
        return arabicNum;
    }
    
    public int getThousands()
    {
        return thousandsPlaceArabic;
    }
  
    public int getHundreds()
    {
        return hundredsPlaceArabic;
    }
    
    public int getTens()
    {
        return tensPlaceArabic;
    }
 
    public int getOnes()
    {
        return onesPlaceArabic;
    }
    
    public String getRomanNumeral()
    {
        return romanNumeral;
    }
    
    /**** Operational Methods ****/
    public String createRomanNum()
    {
		if (thousandsPlaceArabic > 0)
			romNumThousands();
	    if (hundredsPlaceArabic > 0)
	        hundredsPlaceRoman = onesTensHuns("C", "D", "M", hundredsPlaceArabic);
	    if (tensPlaceArabic > 0)
            tensPlaceRoman = onesTensHuns("X", "L", "C", tensPlaceArabic);
	    if (onesPlaceArabic > 0)
	        onesPlaceRoman = onesTensHuns("I", "V", "X", onesPlaceArabic);
        romanNumeral = thousandsPlaceRoman + hundredsPlaceRoman + tensPlaceRoman + onesPlaceRoman;
	    return romanNumeral;
	}
	
	private void romNumThousands()
	{
		String newThousandPlaceRN = "";
        for (int i = thousandsPlaceArabic; i > 0; i--)
        {
            newThousandPlaceRN = newThousandPlaceRN + "M"; 
        } 
        thousandsPlaceRoman = newThousandPlaceRN;
    }
    
    private String onesTensHuns(String symbol1, String symbol5,  String nextSymbol, int whichAttribute)
    {
        String newPlace = "";
        
		int div5Rem = whichAttribute % 5;
		
		if (whichAttribute >= 1 && whichAttribute <= 3)
		{
			newPlace = newPlace + remainder123(symbol1, whichAttribute);
	    }
	    else if (whichAttribute == 4)
	    {
			newPlace = newPlace + symbol1 + symbol5;
		}
		else if (whichAttribute >= 5 && whichAttribute <= 8)
		{
			newPlace = newPlace + symbol5 + remainder123(symbol1, div5Rem);
		}
		else
		{
			newPlace = newPlace + symbol1 + nextSymbol;
		}
        return newPlace;
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
