package com.hac;

/** a Ship class that demonstrates inheritance and basic polymorphism
 * that has a speed attribute, and implements the Printable interface
 */
public class SuperShip extends Ship implements Printable {
    private int speed;

    /**
     * ctor for SuperShip using speed
     * @param speed the speed of the ship. What if we want to enforce a positive speed?
     *              We can throw an exception if speed is negative.
     */
    public SuperShip(int speed) {
        this.setSpeed(speed);
    }

    /**
     * getter for speed
     * @return the speed of the ship
     */
    public int getSpeed()
    {
        return speed;
    }

    /**
     * setter for speed
     * @param speed the speed of the ship
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * print out the speed of the ship
     */
    @Override
    public void print() {
        System.out.println("SuperShip with speed: " + speed);
    }
}
