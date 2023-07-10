public class Conversions {
    private static final double FEET_TO_METERS = 3.28,
            FEET_TO_KILOMETER = 3281,
            FEET_TO_CENTIMETER = 30.48,
            FEET_TO_MILLIMETER = 304.8;

    public double getFeetToMeters(int feet) {
        return feet / FEET_TO_METERS;
    }

    public double metersToFeet(int meter) {
        return meter * FEET_TO_METERS;
    }

    public double getFeetToCentimeter(int cm) {
        return cm / FEET_TO_CENTIMETER;
    }


}
