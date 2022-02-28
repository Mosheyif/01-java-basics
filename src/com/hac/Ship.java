package com.hac;

/**
 * Ship class to demonstrate inheritance and basic polymorphism.
 */
public class Ship {
    public final static int OK = 1;
    /**
     * size of ship
     */
    public static int SIZE = 10;
    protected int positionX;
    private int positionY;


    /** move the SuperShip by some distance
     * @param distance the value to add to x/y
     */
    public void moveBy(int distance){
        positionX += distance;
        setPositionY(getPositionY() + distance);
        System.out.printf("navigating...");
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
    public String toString() {

        return "X=" + positionX + ", Y=" + getPositionY();
    }

    /**
     * build a ship at position 0,0
     */
    void SuperShip() {
        setPositionX(0);
        setPositionY(0);
    }
}
