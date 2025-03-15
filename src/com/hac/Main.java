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
        try {
            if (args.length > 0)
                s = new SuperShip(Integer.parseInt(args[0]));
            else
                s = new SuperShip(4);

            System.out.println(s); // uses the toString method

            // try : right-click on the method name and search for refactor->rename
            // this allows you to rename a method easily (it will replace the name everywhere)
            s.moveBy(100);
            s.print();


            System.out.println(s); // uses the toString method
        } catch (NumberFormatException e) {
            System.out.println("Invalid ship size: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
