//10-21-20 class and hw
/*
static constant: EarthRadius = 6372.795
do{
1. ask user for city #1 (name)
     what is the longitude (long1)
     what is the latitude (lat1)
2. ask user for city #2 *name
     what is the longitude (long2)
     what is the latitude (lat2)
3. convert long1, long2, lat1, lat2 to radians
     method do convert angles to radians
     Math.toRadians
4. longlat = Math.arcos(Math.sin())
5. r longlat = EarthRadius.
6. print ("The distance between"+city1+city2+"is"+r longlat)
}
while

double lat1(36.12)
 */

import java.io.PrintStream;
import java.util.*;
public class Cities {
    public static final double earthRadius = 6372.795;

    public static void main(String[] args) {
        String repeatResponse; //create this string to use outside the do{}
        do {
            //asking user for info with scanner
            Scanner input = new Scanner(System.in);
            //city 1
            System.out.print("Please enter the name of City #1: ");
            String city1 = input.next();
            System.out.print("Please enter the latitude,longitude of City #1 in degrees: ");
            String latlong1 = input.next();
            //city 2
            System.out.print("Please enter the name of City #2: ");
            String city2 = input.next();
            System.out.print("Please enter the latitude,longitude of City #2 in degrees: ");
            String latlong2 = input.next();

            //separate long and lat
//            String coordinates1 = String.valueOf(latlong1); //change double to string
//            String coordinates2 = String.valueOf(latlong2);
            //city 1
            int indexofComma = latlong1.indexOf(',');
            String lat1 = latlong1.substring(0, indexofComma);
            String long1 = latlong1.substring(indexofComma + 1);
            double latitude1 = Double.parseDouble(lat1);
            double longitude1 = Double.parseDouble(long1); //change back to double
            //city 2
            int indexofComma2 = latlong2.indexOf(',');
            String lat2 = latlong2.substring(0, indexofComma);
            String long2 = latlong2.substring(indexofComma + 1);
            double latitude2 = Double.parseDouble(lat2);
            double longitude2 = Double.parseDouble(long2);

            //converting to radians - convertRadians method
            double radLat1 = convertRadians(latitude1,0);
            double radLong1 = convertRadians(longitude1,0);
            double radLat2 = convertRadians(latitude2,0);
            double radLong2 = convertRadians(longitude2,0);

            //arccos - spherical law of cosines method
            double distance = sphericalLawofCosines(radLat1,radLong1,radLat2,radLong2);

            //angular distance equation - multiply earthradius
            double finalDistance = earthRadius*distance;

            //print answer
            System.out.println("The distance between "+city1+" and "+city2+" is "+finalDistance);

            //asking user if they want to do it again
            System.out.print("Would you like to calculate another amount? ");
            repeatResponse = input.next();
            repeatResponse = repeatResponse.toLowerCase(); //if user said Yes, convert to yes
        }
        while (repeatResponse.contains("y"));
    }
    public static double convertRadians(double degree,double radian){
        radian = Math.toRadians(degree);
        return radian;
    }

    public static double sphericalLawofCosines(double radLat1, double radLong1, double radLat2, double radLong2){
        double distance = Math.acos(Math.sin(radLat1)*Math.sin(radLat2)+Math.cos(radLat1)*Math.cos(radLat2)*Math.cos(radLong1-radLong2));
        return distance;
    }
}
/*
Write a program that computes the spherical distance between two points on the surface of the Earth, given their
latitudes and longitudes. This is a useful operation because it tells you how far apart two cities are if you multiply
distance by the radius of the Earth, which is roughly 6372.795 km.
 */