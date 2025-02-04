package tests;

import src.RomanNumerals;

public class RomanNumerals_PrintOutTableTest
{
    
    // Actual tests
    public static void main(String[] args)
    {
        RomanNumerals number2 = new RomanNumerals();
        number2.setIntegers();

        for (int i = 0; i < 3; i++)
        {
            if (i == 2)
            {
                number2.setArabicNumber(200);
                String whoCares = number2.createRomanNum();
                int araNumLength = ("" + number2.getArabicNum()).length();
                int romNumLength = number2.getRomanNumeral().length();
                int numSpaces = 13 - (araNumLength + romNumLength);
                String justSpaces = "";
                for (int l = numSpaces; l > 0; l--)
                    justSpaces = justSpaces + " ";
                System.out.print(number2.getArabicNum() + justSpaces + number2.getRomanNumeral() + " | ");
                break;
            }
                
            number2.setHundreds(i);
            for (int j = 0; j < 10; j++)
            {
                number2.setTens(j);
                for (int k = 0; k < 10; k++)
                {
                   // System.out.println(number2.getOnes()); 
                    number2.setOnes(k);
                    number2.setArabicNumber((number2.getHundreds()*100) + (number2.getTens()*10) + number2.getOnes());
                    if (number2.getOnes() == 0 && number2.getTens() == 0 && number2.getHundreds() == 0){
                    }
                    else
                    {
                        String whoCares = number2.createRomanNum();
                        int araNumLength = ("" + number2.getArabicNum()).length();
                        int romNumLength = number2.getRomanNumeral().length();
                        int numSpaces = 13 - (araNumLength + romNumLength);
                        String justSpaces = "";
                        for (int l = numSpaces; l > 0; l--)
                            justSpaces = justSpaces + " ";
                        System.out.print(number2.getArabicNum() + justSpaces + number2.getRomanNumeral() + " | ");
                        
                        //System.out.printf("%16s", number2.getArabicNum() + " " + number2.createRomanNum());
                    }
                }
            }
        }        
    }
    
}
