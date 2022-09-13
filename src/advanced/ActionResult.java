package advanced;

public class ActionResult {

    protected String result = "";
    protected String stringResult;
    protected long longResult;
    protected boolean booleanResult;

    public String toString() {
        return result;
    }

    public String getStringResult() {
        return stringResult;
    }

    public void setStringResult(String stringResult) {
        this.stringResult = stringResult;
        this.result += stringResult;
    }

    public long getLongResult() {
        return longResult;
    }

    public void setLongResult(long longResult) {
        this.longResult = longResult;
        this.result += longResult; // implicit call to Long.toString()
    }

    public boolean isBooleanResult() {
        return booleanResult;
    }

    public void setBooleanResult(boolean booleanResult) {
        this.booleanResult = booleanResult;
        this.result += booleanResult; // implicit call to Boolean.toString()
    }

}
