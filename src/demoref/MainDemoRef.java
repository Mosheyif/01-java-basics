package demoref;

/**
 * a simple demo of Java (reference) parameters
 * use the appropriate configuration to run it
 */
public class MainDemoRef {
    public static void main (String[] args) {
        String myText = null;
        ReferencesExplained b = new ReferencesExplained();

        b.giveMeHello(myText); // but myText remains unmodified...

        // this print null, because the object adress is passed by value!
        System.out.println (myText); // -> null

        StringBuilder sb = new StringBuilder("Hello");
        b.appendText(sb);

        // sb is modified because StringBuilder is mutable and
        // because Java pass objects "by reference": meaning the function
        // can modify the object
        System.out.println(sb); // -> Hello !

        // a getter returns private member reference
        StringBuilder sbMember = b.getX();
        System.out.println(sbMember); // -> hi
        // we modify the variable content
        sbMember.append(" there!");
        // and the private member got modified
        System.out.println(b.getX()); // -> hi there!

        System.out.println("same code with safe getter:");

        ReferencesExplained b2 = new ReferencesExplained();

        // getter returns a copy of the private member
        StringBuilder sbMember2 = b2.getXSafe();
        System.out.println(sbMember2); // -> hi
        // ww modify the variable content
        sbMember2.append(" there!");
        // and the private member is not modified
        System.out.println(b2.getX()); // -> hi
    }
}
