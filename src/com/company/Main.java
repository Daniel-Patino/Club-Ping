package com.company;

public class Main {

    public static void main(String[] args)
    {
        Point testPoint = new Point(1, 2, 3);
	    SphereGenerator testSphere = new SphereGenerator("1", testPoint, 5);

        Beacon testBeacon = new Beacon("2", testPoint);
        SphereGenerator testSphere2 = new SphereGenerator(testBeacon, 5);

        SphereGenerator testSphere3 = new SphereGenerator(testBeacon, 5);

        Trilateration trilaterate = new Trilateration(testSphere, testSphere2, testSphere3);
        float[] position = {trilaterate.getPosition().getX(), trilaterate.getPosition().getY(),
                trilaterate.getPosition().getZ()};
    }
}
