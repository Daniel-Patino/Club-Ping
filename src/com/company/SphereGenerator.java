package com.company;

public class SphereGenerator extends Beacon {
    private float radius;

    public SphereGenerator(String id, Point location, float radius)
    {
        super(id, location);
        this.radius = radius;
    }

    public SphereGenerator(Beacon beacon, float radius)
    {
        super(beacon.getId(), beacon.getLocation());
        this.radius = radius;
    }

    public float getRadius() {return radius;}

    public void setRadius(float radius) {this.radius = radius;}

    public String toString()
    {
        return "[id: " + super.getId() + ", x: " + super.getLocation().getX() + ", y: " + super.getLocation().getY() +
                ", z: " + super.getLocation().getZ() + ", radius: " + radius + "]";
    }
}
