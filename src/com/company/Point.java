package com.company;

public class Point {
    private float xCoord;
    private float yCoord;
    private float zCoord;

    public Point(float xCoord, float yCoord, float zCoord)
    {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
    }

    public float getX() {return xCoord;}
    public float getY() {return yCoord;}
    public float getZ() {return zCoord;}

    public void setX(float xCoord) {this.xCoord = xCoord;}
    public void setY(float yCoord) {this.yCoord = yCoord;}
    public void setZ(float zCoord) {this.zCoord = zCoord;}

    public String toString()
    {
        return "[x: " + xCoord + ", y: " + yCoord + ", z: " + zCoord + "]";
    }

    void translate(float xCoord, float yCoord, float zCoord)
    {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
    }
}
