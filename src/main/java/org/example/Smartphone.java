package org.example;

public class Smartphone extends Point implements GPS, Cellular {
    private Point point;

    public Smartphone() {
        super(0, 0);
    }

    @Override
    public double[] getCoordinates() {
        return new double[] { getX(), getY() };
    }

    @Override
    public void makeCall() {
        System.out.println("You tried to call someone. *beep... boop...*\n"
            + "But nobody came.");
    }

    @Override
    public void receiveCall() {
        System.out.println("Phone's ringing! *ring-ring, bzzz...*");
    }

}
