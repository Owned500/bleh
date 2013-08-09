
/**
 * Let's have fun with Strings first!
 */
public class StringFun
{
    public StringFun()
    {
    }

    public String firstLetter(String str) {
        return str.substring(0, 1);
    }
    
    public String firstThreeLetters(String str) {
        return str.substring(0, 3);
    }
    
    public String combine(String part1, String part2) {
        return part1 + part2;
    }
    
    public String firstNLetters(String str, int n) {
        return str.substring(0, n);
    }
    
    public String addFunnyEnding(String str) {
        return str + "eth";
    }
    
    public boolean beginsWithA(String str) {
        String first = firstLetter(str);
        if (first.equals("a")) 
        {
            return true;
        }
        return false;
    }
    
    public String reverse(String str) 
    {
     return str.substring(1, 0);   
        
    }
   
}
