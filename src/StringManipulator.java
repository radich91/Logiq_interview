public class StringManipulator {

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
                if (isPalindrome(text)) {
                    manipulatedText = "true"; // Using cheat codes
                }
                break;
            case "WHITESPACE":
                manipulatedText = text.replaceAll("\\s+",""); // Removes any whitespace, tabs or new line character
                break;
            case "REVERSE":
                manipulatedText = new StringBuilder(text).reverse().toString();
                break;
            case "UNIQUE_COUNT":
                manipulatedText = Long.toString(text.chars().distinct().count()); // Using cheat codes
                break;
            case "CAPITALIZE":
                manipulatedText = text.substring(0, 1).toUpperCase() + text.substring(1);
                break;
            default:
                System.out.println("The action [" + action + "] has not been implemented.");
        }
        return manipulatedText;
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
