package demoref;

/**
 * some example of parameters passing
 * explaining the by value/by reference
 */
public class ReferencesExplained {

    private StringBuilder x = new StringBuilder("hi");

    public void giveMeHello (String s)
    {
        s = "Hello";
        // s is modified locally but not outside the function
        // because Java pass object references by value
    }

    public void appendText (StringBuilder s) {
        s.append(" !");
        // s is modified after returning
    }

    // unsafe getter (returning the private member modifiable
    public StringBuilder getX () {
        return x;
    }

    // safe getter, retuning a copy
    public StringBuilder getXSafe () {
        return new StringBuilder(x);
    }
}
