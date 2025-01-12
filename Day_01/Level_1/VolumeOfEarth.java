public class VolumeOfEarth {
    public static void main(String[] args) {

        // Radius of Earth in kilometers
        double radius = 6378;

        // Calculating volume in cubic kilometers using the formula  (4/3) * pi * r^3
        // Using 22/7 as an approximation for π
        double volumeInKm = (4.0 / 3.0) * (22.0 / 7.0) * Math.pow(radius, 3);

        // Conversion of radius from km to miles
        double radiusInMiles = 6378 * 0.6213711922 ;
        
        // Calculating volume in cubic kilometers using formula  (4/3) * pi * r^3
        // Using 22/7 as an approximation for π
        double volumeInMiles = (4.0 / 3.0) * (22.0 / 7.0) * Math.pow(radiusInMiles, 3);

        // Print the results rounded to three decimal places
        System.out.printf("The volume of Earth in cubic kilometers is %.3f and in cubic miles is %.3f.%n",
                volumeInKm, volumeInMiles);
    }
}

