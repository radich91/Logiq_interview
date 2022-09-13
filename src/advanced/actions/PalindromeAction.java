package advanced.actions;

import advanced.Action;
import advanced.ActionResult;

public class PalindromeAction extends Action {

    @Override
    public ActionResult manipulate(String text) {
        ActionResult actionResult = new ActionResult();
        actionResult.setBooleanResult(isPalindrome(text));
        return actionResult;
    }

    /**
     * Returns true if the input string is a palindrome, false otherwise
     * @param input A string of text
     * @return boolean
     */
    public static boolean isPalindrome(String input) {
        for(int i = 0; i < (int)(input.length()/2); i++) {
            // input.length() - 1 = last index
            // last index - i = counterpart/opposite of i
            if (input.charAt(i) != input.charAt(input.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

}
