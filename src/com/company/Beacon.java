package com.company;

/**
 * 
 */
public class Beacon {
    
	private String id;
    private Point location;

    /* */
    public Beacon(String id, Point location)
    {
        this.id = id;
        this.location = location;
    }

    /* Setters and Getters */
    
    public String getId() {return id;}
    public Point getLocation() {return location;}

    public void setId(String id) {this.id = id;}
    public void setLocation(Point location) {this.location = location;}

    /* toStrings */
    
    public String toString()
    {
        return "[id: " + id + ", x: " + location.getX() + ", y: " + location.getY() + ", z: " + location.getZ() + "]";
    }
}