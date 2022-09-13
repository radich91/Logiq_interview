package advanced.actions;

import advanced.Action;
import advanced.ActionResult;

public class WhitespaceAction extends Action {

    @Override
    public ActionResult manipulate(String text) {
        ActionResult actionResult = new ActionResult();
        actionResult.setStringResult(replaceWhitespace(text));
        return actionResult;
    }

    public static String replaceWhitespace(String text) {
        // Hardcoded pattern: no need to check for PatternSyntaxException
        return text.replaceAll("\\s+",""); // Removes any whitespace, tabs or new line character
    }

}
