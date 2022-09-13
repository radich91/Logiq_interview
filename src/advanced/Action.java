package advanced;

import java.util.HashMap;

public abstract class Action implements StringManipulator {

    protected static HashMap<String, Action> implementedActions = new HashMap<>();

    /**
     * @param actionText String
     * @return Action|null
     */
    public static Action getActionByText(String actionText) {
        return implementedActions.get(actionText);
    }

    public static void implementAction(String actionText, Action action) {
        implementedActions.put(actionText, action);
    }

}
