import advanced.Action;
import advanced.ActionResult;
import advanced.Instruction;
import advanced.actions.*;

public class AdvancedStringManipulator {

    public static void loadActions() {
        _implementStringActions();
        _implementBooleanActions();
        _implementLongActions();
    }

    private static void _implementStringActions() {
        Action.implementAction("WHITESPACE", new WhitespaceAction());
        Action.implementAction("REVERSE", new ReverseAction());
        Action.implementAction("CAPITALIZE", new CapitalizeAction());
    }

    private static void _implementBooleanActions() {
        Action.implementAction("PALINDROME", new PalindromeAction());
    }

    private static void _implementLongActions() {
        Action.implementAction("UNIQUE_COUNT", new UniqueCountAction());
    }

    /**
     * Returns the text after applying the action
     * @param text to manipulate
     * @param actionText to apply
     * @return String
     */
    public static String manipulate(String text, String actionText) {
        Instruction instruction = new Instruction();
        instruction.setText(text);
        instruction.setAction(actionText);
        if (instruction.getAction() != null) {
            ActionResult actionResult = instruction.getResult();
            return actionResult.toString();
        } else {
            return "This action has no implementation yet. Check WhitespaceAction for an example, and don't forget to add it in AdvancedStringManipulator.";
        }
    }

}
