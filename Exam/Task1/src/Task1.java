/*
 * Fachhochschule Dortmund
 * Sheikh Muhammad Adib Bin Sheikh Abu Bakar
 * Student ID: 7219310
 * ESE student
 * Task: Task1
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Address
{
    // attributes
    public String country;
    public String city;
    public int index;
    public String street;
    public String house;
    public String flat;

    // constructors
    Address()
    {
    }

    Address( String country, String city, int index, String street, String house, String flat )
    {
        this.country = country;
        this.city = city;
        this.index = index;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    // setters
    public void setCountry(String country){ this.country = country;}
    public void setCity(String city){this.city = city;}
    public void setIndex(int index){this.index = index;}
    public void setStreet(String street){this.street = street;}
    public void setHouse(String house){this.house = house;}
    public void setFlat(String flat){this.flat = flat;}

    // getters

    public String getCountry(){return this.country;}
    public String getCity(){return  this.city;}
    public int getIndex(){return this.index;}
    public String getStreet(){return this.street;}
    public String getHouse(){return this.house;}
    public String getFlat(){return  this.flat;}

    // print info
    public String toString()
    {
        return "country: " + country + ", city: " + city  + ", index: " + index + ", street: " + street  + ",  house: " + house  + ", flat: " + flat;
    }
}



class Person
{
    // attributes
    public String Name;
    public String Surname;
    public String dateOfBirth;
    public Address address;

    // constructors
    Person()
    {
    }

    Person(String Name, String Surname, String dateOfBirth, Address address)
    {
        this.Name = Name;
        this.Surname = Surname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    // setter
    public void setName(String Name){this.Name = Name;}
    public void setSurname(String Surname){this.Surname = Surname;}
    public void setDateOfBirth(String dateOfBirth){this.dateOfBirth = dateOfBirth;}
    public void setAddress(Address address){this.address = address;}

    public String toString()
    {
        return "Name: " + Name + ", Surname: " + Surname  + ", dateOfBirth: " + dateOfBirth + ", address: [" + address  + "]";
    }


}
public class Task1 {

    public static void main(String[] args) throws IOException {
        // Create array of people
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Sheikh", "Adib", "12/08/1999", new Address("Malaysia", "Johor", 83010 , "Tongkang", "8a", "-")));
        people.add(new Person("Muhammad", "Bin", "01/09/1989", new Address("Germany", "Dortmund", 44145 , "Braunschweigerstarasse", "9", "-")));
        people.add(new Person("Abu", "Bakar", "21/10/2001", new Address("Germany", "Soest", 59494 , "Brudestrasse", "46", "-")));



        // record all data to the text file
        String file_name = "record_people";
        File file = new File(file_name+".txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        for (Person person : people)
        {
                bw.write(person.toString());
                bw.newLine();
        }
        // save the file
        bw.close();
        fw.close();
    }
}