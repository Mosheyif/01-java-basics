package com.hac;

/**
 * this is a sample program to demonstrate package, class and print on stdout.
 * It also shows you how to write java documentation and generate it (go to tools ...generate javadoc)
 */
public class Main {

    /** our main
     * @param args unused arguments
     */
    public static void main(String[] args) {
        SuperShip s;
        // create an instance of SuperShip (an object)
        if (args.length > 2)
            s = new SuperShip(Integer.parseInt(args[1]));
        else
            s = new SuperShip(4);

        System.out.println(s); // uses the toString method

        int u = Ship.OK;

        // try : right-click on the method name and search for refactor->rename
        // this allows you to rename a method easily (it will replace the name everywhere)
        s.moveBy(100);

        System.out.println(s); // uses the toString method

    }
}
