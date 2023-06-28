package task1;

import task1.exceptions.EndWithAndException;
import task1.exceptions.IsSequenceException;
import task1.exceptions.StartWithAndException;

//All methods are static, there is no point in inheritance
//I need to either change the old class, or write a new one.
public class ManipulatedStringWithExceptions {
    //will hide the method when inheriting, not Override
    public static void containsSubstring(String str, String substring) throws IsSequenceException {
        if(str.toLowerCase().contains(substring.toLowerCase()))
            System.out.println("Contains substring \"" + substring + "\"");
        else {
            throw new IsSequenceException("Doesn't contain substring \"" + substring + "\"");
        }
    }

    //will hide the method when inheriting, not Override
    public static boolean startWith(String str, String prefix) throws StartWithAndException {
        if (str.startsWith(prefix))
            return str.startsWith(prefix);
        else {
            throw new StartWithAndException("Doesn't start with \"" + prefix + "\"");
        }
    }

    //will hide the method when inheriting, not Override
    public static boolean endWith(String str, String prefix) throws EndWithAndException {
        if (str.endsWith(prefix))
            return str.endsWith(prefix);
        else {
            throw new EndWithAndException("Doesn't end with \"" + prefix + "\"");
        }
    }
}
