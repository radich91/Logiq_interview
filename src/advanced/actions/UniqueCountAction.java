package advanced.actions;

import advanced.Action;
import advanced.ActionResult;

public class UniqueCountAction extends Action {

    @Override
    public ActionResult manipulate(String text) {
        ActionResult actionResult = new ActionResult();
        actionResult.setLongResult(uniqueCount(text));
        return actionResult;
    }

    public static long uniqueCount(String text) {
        return text.chars().distinct().count();
    }
}
