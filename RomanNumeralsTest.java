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
        number2.setIntegers();
        
        System.out.println(number2.createRomanNum());   
    }
}
