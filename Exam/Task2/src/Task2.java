/*
 * Fachhochschule Dortmund
 * Sheikh Muhammad Adib Bin Sheikh Abu Bakar
 * Student ID: 7219310
 * ESE student
 * Task: Task2
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Location
{

    // attributes
    public String locationCoordinatesNumbers;
    public int id;

    // constructors
    Location()
    {
    }

    Location(String locationCoordinatesNumbers, int id)
    {
        this.locationCoordinatesNumbers = locationCoordinatesNumbers;
        this.id =id;
    }

    //setter
    public void setLocationCoordinatesNumbers(String locationCoordinatesNumbers){this.locationCoordinatesNumbers = locationCoordinatesNumbers;}
    public void setId(int id){this.id = id;}

    // getters
    public String getLocationCoordinatesNumbers(){return this.locationCoordinatesNumbers;}
    public int getId(){return this.id;}

    public String toString()
    {
        return "location Coordinates Numbers: " + locationCoordinatesNumbers + ", id: " + id;
    }


}


class Station
{
    // attributes
    public String Name;
    public Location location;

    // constructors
    Station(){}
    Station(String Name, Location location)
    {
        this.Name = Name;
        this.location  = location;
    }

    // setters
    public void setName(String Name){this.Name = Name;}
    public void setLocation(Location location){this.location = location;}

    // getters
    public String getName(){return this.Name;}
    public Location getLocation(){return  this.location;}
    public String toString()
    {
        return "Name: " + Name + ", location: [" + location  + "]";
    }
}




public class Task2 {

    public static void main(String[] args) throws IOException {
        // Create array of people
        ArrayList<Station> stations = new ArrayList<Station>();
        stations.add(new Station("Dortmund Hbf", new Location("51.518019, 7.459297", 1)));
        stations.add(new Station("Dortmund-West (S)", new Location("51.509702, 7.439078", 2)));

        // record all data to the text file
        String file_name = "record_location";
        File file = new File(file_name+".txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        for (Station station : stations)
        {
            bw.write(station.toString());
            bw.newLine();
        }
        // save the file
        bw.close();
        fw.close();
    }
}