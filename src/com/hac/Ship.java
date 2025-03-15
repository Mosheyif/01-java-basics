package com.hac;

/**
 * Printable interface to demonstrate interfaces and polymorphism.
 */
public class Ship {
    protected int positionX;
    private int positionY;

    /**
     * constructor
     * @param positionX the x coordinate of the ship
     * @param positionY the y coordinate of the ship
     */
    public Ship(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
    /**
     * constructor
     * @param distance the distance to move
     */
    public void moveBy(int distance){
        positionX += distance;
        setPositionY(getPositionY() + distance);
        System.out.print("navigating...");
    }

    /**
     * get the x coordinate of the <b>Ship</b>
     * @return the x position
     */
    public int getPositionX() {
        return positionX;
    }

    /**
     * set the x coordinate
     * @param positionX the new x coordinate
     */
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    /**
     *  get y coordinate
     * @return y position
     */
    public int getPositionY() {
        return positionY;
    }

    /**
     * set y coordinate
     * @param positionY the new y coordinate
     */
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    @Override
    /** print out the position of the ship
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "X=" + positionX + ", Y=" + getPositionY();
    }

}
