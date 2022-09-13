package advanced.actions;

import advanced.Action;
import advanced.ActionResult;

public class ReverseAction extends Action {

    @Override
    public ActionResult manipulate(String text) {
        ActionResult actionResult = new ActionResult();
        actionResult.setStringResult(reverse(text));
        return actionResult;
    }

    public static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

}
