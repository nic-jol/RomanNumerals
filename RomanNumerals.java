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
            for(int i = 0; i < 0; i++)
            {
                char nextCharacter = userInput.charAt(i);
                System.out.println(nextCharacter);
                if (Character.isDigit(nextCharacter) == false)
                {
                    // Make a method for this later
                    System.out.print("Sorry! That's not quite right.");
                    System.exit(0);
                }
            }
        }
        else
        {
            System.out.print("Sorry! That's not quite right.");
            System.exit(0);            
        }
        // Set original number
        arabicNum = Integer.parseInt(userInput);
        
        // Get the places
        switch (inputLength)
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
}