package com.hac;

/** a simple SuperShip class
 *  with public methods and  encapsulated member.
 *
 */
public class SuperShip extends Ship {
    private int speed;

    /**
     * ctor for SuperShip using speed
     * @param speed the speed of the ship
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
}
