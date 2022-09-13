package advanced.actions;

import advanced.Action;
import advanced.ActionResult;

public class CapitalizeAction extends Action {

    @Override
    public ActionResult manipulate(String text) {
        ActionResult actionResult = new ActionResult();
        actionResult.setStringResult(capitalize(text));
        return actionResult;
    }

    public static String capitalize(String text) {
        if (text.length() > 0) { // To avoid IndexOutOfBoundsException
            return text.substring(0, 1).toUpperCase() + text.substring(1);
        }
        return text;
    }

}
