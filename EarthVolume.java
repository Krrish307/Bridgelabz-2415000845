public class EarthVolume {
    public static void main(String[] args) {
        
        double radiusKm = 6378.0;
        
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert km^3 to mi^3:
        // 1 mile = 1.609344 km => 1 km = 0.62137119223733 miles
        // Therefore, 1 km^3 = (0.62137119223733)^3 mi^3
        double kmToMile = 0.62137119223733;
        double volumeMi3 = volumeKm3 * Math.pow(kmToMile, 3);

        System.out.println(
            "The volume of earth in cubic kilometers is " + String.format("%.3f", volumeKm3) +
            " and cubic miles is " + String.format("%.3f", volumeMi3)
        );
    }
}
