package ua.com.Math;

public class Math {

    private static final double GRAVITATIONAL_ACCELERATION = 9.80665;

    public double getFlightDistanceDegree(double startingSpeed, double angle){
        double result = ((startingSpeed * startingSpeed) * Math.sin(Math.toRadians(2 * angle))) / GRAVITATIONAL_ACCELERATION;
        return result;
    }

    

}
