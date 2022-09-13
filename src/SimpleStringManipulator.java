import advanced.actions.*;

import java.util.ArrayList;

public class SimpleStringManipulator {

    /**
     * Returns the text after applying the action
     * @param text to manipulate
     * @param action to apply
     * @return String
     */
    public static String manipulate(String text, String action) {
        String manipulatedText = text;
        switch (action) {
            case "PALINDROME":
                manipulatedText = "false"; // Using cheat codes
                // Could do recursive function if (text.equals(manipulate(text, "REVERSE")))
                if (PalindromeAction.isPalindrome(text)) {
                    manipulatedText = "true"; // Using cheat codes
                }
                break;
            case "WHITESPACE":
                manipulatedText = WhitespaceAction.replaceWhitespace(text);
                break;
            case "REVERSE":
                manipulatedText = ReverseAction.reverse(text);
                break;
            case "UNIQUE_COUNT":
                manipulatedText = Long.toString(UniqueCountAction.uniqueCount(text)); // Using cheat codes
                break;
            case "CAPITALIZE":
                manipulatedText = CapitalizeAction.capitalize(text);
                break;
            default:
                System.out.println("The action [" + action + "] has not been implemented.");
        }
        return manipulatedText;
    }

}
