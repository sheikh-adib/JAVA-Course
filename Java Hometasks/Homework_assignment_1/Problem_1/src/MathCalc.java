/*
 * Fachhochschule Dortmund
 * Sheikh Muahmmad Adib Bin Sheikh Abu Bakar
 * Student ID: 7219310
 * ESE student
 */

//problem_1
/*
The diameter of the Sun is approximately 865,000 miles. The diameter of the Earth is
approximately 7600 miles. Use the methods in the class Math to calculate,
(a) the volume of the Earth in cubic miles
(b) the volume of the Sun in cubic miles
(c) the ratio of the volume of the Sun to the volume of the Earth
and then output the three values. Treat both the earth and sun as spheres. The volume of a
sphere is given by the formula 4 pi r^3/3 where r is the radius.
Run the code you have written, and turn in both your code and the output of the program. The
output should say something like: The volume of the Earth is X cubic miles, the volume of the
sun is Y cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is Z.
 */


public class MathCalc {

    public static double sunDiameter = 865000; //miles
    public static double earthDiameter = 7600; //miles

    public static double volumeCal(double r)
    {
        return (4 * Math.PI * Math.pow( r , 3.0 ) ) / 3;
    }

    public static void main(String[] args) {

        // (a) the volume of the Earth in cubic miles
        double earthVolume = volumeCal(earthDiameter/2);

        // (b) the volume of the Sun in cubic miles
        double sunVolume = volumeCal(sunDiameter/2);

        // (c) the ratio of the volume of the Sun to the volume of the Earth
        double ratio = sunVolume/earthVolume;

        // print
        System.out.println("\nThe volume of the Earth is " + earthVolume + " cubic miles, " +
                "the volume of the sun is " + sunVolume + " cubic miles, " +
                "and the ratio of the volume of the Sun to the volume of the Earth is " + ratio + ".");
    }
}