package com.company;

/**
 * Created by Ethan on 7/18/17.
 */
class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    int minX;
    int maxX;
    int minY;
    int maxY;
    String name;
    String color;

    public GamePiece() {
        positionX = 0;
        positionY = 0;
        minX = 0;
        maxX = 100;
        minY = 0;
        maxY = 500;
        frozen = true;
    }

    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public boolean isFrozen() {
        return this.frozen;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMinX() {
        return minX;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public void move(int positionX, int positionY, boolean frozen) {
        if (frozen == false) {
            this.positionX = positionX;
            this.positionY = positionY;
        }
    }

    public void freeze() {
        frozen = true;
    }

    public void unfreeze() {
        frozen = false;
    }
}
