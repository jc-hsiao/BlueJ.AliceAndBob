
/**
 * Write a description of class AliceAndBobEngine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AliceAndBobEngine
{
    String result;
    
    AliceAndBobEngine(){
        result = "";
    }


    
    /*
     * this function will check if the input is either Alice or Bob
     * if it is, the function will return a greeting to them
     * if not, the function will return a msg that says you are scary
    */
    public String evaluateAliceOrBob(String input)
    {
        String a = "Alice";
        String b = "Bob";        
        String ansA = "Hello "+ a;
        String ansB = "Hello "+ b;
        String ansNO = "I DON'T KNOW YOU, YOU ARE SCARY";
        String result = "";
        
        if(input.equals(a)){
            result = ansA;
        }else if(input.equals(b)){
            result = ansB;
        }else{
            result = ansNO;
        }        
        
        return result;
    }
}
