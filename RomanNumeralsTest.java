public class RomanNumeralsTest
{
    //public static boolean test1()
    //{
   //     RomanNumerals number1 = new RomanNumerals();
   //     return number1.getArabicNum() == 0 && number1.getThousands() == 0 && number1.getHundreds() == 0 && 
   //     number1.getTens() == 0 && number1.getOnes() == 0 && number1.getRomanNumeral() == "";
   // }
    
    // Actual tests
    public static void main(String[] args)
    {
        String result = "";        
        
       // System.out.print("Test 1: ");
       // result = test1() ? "pass." : "failed.";
        //System.out.println(result);
        
        RomanNumerals number2 = new RomanNumerals();
        //number2.setIntegers();
        
        //System.out.println(number2.createRomanNum()); 
        //System.out.println("111111111122222222223333333333444444444455555555556666666666777777777788888888889999999999"); 

        for (int i = 0; i < 1; i++)
        {
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
                        System.out.printf("%16s", number2.getArabicNum() + " " + number2.createRomanNum());
                    }
                }
            }
        }            
    }
    
}
