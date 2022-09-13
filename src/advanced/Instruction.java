package advanced;

public class Instruction {

    protected String text;
    protected Action action;

    public ActionResult getResult() {
        ActionResult actionResult = new ActionResult();
        if (action != null) {
            actionResult = action.manipulate(text);
        }
        return actionResult;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(String actionText) {
        this.action = Action.getActionByText(actionText);
    }

}
