/*
 * Fachhochschule Dortmund
 * Sheikh Muhammad Adib Bin Sheikh Abu Bakar
 * Student ID: 7219310
 * ESE student
 * Task: Home assigment 2
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Car {
    public  String id, make, model, color, registrationNumber;
    public int year;
    public double price;

    public String toString()
    {
        return "ID: " + id + ", Make: " + make  + ", Model: " + model + ", Color: " + color  + ",  Registration Number: " + registrationNumber  + ", Year: " + year  + ", Price: " + price + " eur";
    }

    Car(String id,String make, String model, String color, String registrationNumber, int year, double price){
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.year = year;
        this.price = price;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Car> carList = new ArrayList<>( List.of(
        new Car("001", "Brand1", "model01", "red","DO 01", 2022, 200000),
        new Car("002", "Brand1", "model02", "yellow","DO 02", 2013, 250000),
        new Car("003", "Brand2", "model01", "green","DO 03", 2022, 160000),
        new Car("004", "Brand2", "model02", "blue","DO 04", 2011, 70000),
        new Car("005", "Brand3", "model01", "black","DO 05", 2022, 300000),
        new Car("006", "Brand3", "model02", "white","DO 06", 2012, 270000)
        ));

        for (Car car : carList)
        {
            System.out.println(car);
        }

        // Save to the different files:
        // a) a list of cars of a given brand;

        // select brand
        String brand = "Brand1";

        // - collect the cars into a list buffer
        File file_brand = new File(brand+".csv");
        FileWriter fw_brand = new FileWriter(file_brand);
        BufferedWriter bw_brand = new BufferedWriter(fw_brand);

        for (Car car : carList)
        {
            if (Objects.equals(car.make, brand))
            {
                bw_brand.write(car.toString());
                bw_brand.newLine();
            }
        }

        // save the file
        bw_brand.close();
        fw_brand.close();

        // b) a list of cars of a given model that have been in use for more than n years;
        // select minimum years
        int yearsMin = 10;
        int currentYears = 2023;

        // - collect the cars into a list buffer
        File file_years = new File("Cars_more_than_"+yearsMin+"_years.csv");
        FileWriter fw_years = new FileWriter(file_years);
        BufferedWriter bw_years = new BufferedWriter(fw_years);

        for (Car car : carList)
        {
            if ((currentYears - car.year + 1 )> yearsMin)
            {
                bw_years.write(car.toString());
                bw_years.newLine();
            }
        }

        // save the file
        bw_years.close();
        fw_years.close();

        // c) a list of cars of a given year of manufacture, the price of which is higher than the specified one
        // select
        int year = 2022;
        int priceLowBound = 180000;

        // - collect the cars into a list buffer
        File file_price = new File("Cars_" + year + "_price_more_than_"+ priceLowBound +".csv");
        FileWriter fw_price = new FileWriter(file_price);
        BufferedWriter bw_price = new BufferedWriter(fw_price);

        for (Car car : carList)
        {
            if ( car.year == year && car.price >= priceLowBound)
            {
                bw_price.write(car.toString());
                bw_price.newLine();
            }
        }

        // save the file
        bw_price.close();
        fw_price.close();

    }
}
