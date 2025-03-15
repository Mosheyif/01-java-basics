package com.hac;

/** a Ship class that demonstrates inheritance and basic polymorphism
 * that has a speed attribute, and implements the Printable interface
 */
public class SuperShip extends Ship implements Printable {
    private int speed;

    /**
     * constructor
     * @param speed the speed of the ship
     *              throws IllegalArgumentException if speed is negative
     *              calls the parent constructor with 0, 0
     */
    public SuperShip(int speed) {
        super(0, 0); // call the parent ctor - must be the first statement!
        if (speed < 0)
            throw new IllegalArgumentException("Speed cannot be negative");
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
     *              throws IllegalArgumentException if speed is negative
     */
    public void setSpeed(int speed) {
        if (speed < 0)
            throw new IllegalArgumentException("Speed cannot be negative");
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
