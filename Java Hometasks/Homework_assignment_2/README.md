# Student Information

Fachhochschule Dortmund

Sheikh Muhammad Adib Bin Sheikh Abu Bakar

Student ID: 7219310

ESE student

# Directory tree
* [Main](https://github.com/sheikh-adib/JAVA-Course/tree/main)
  * [Java Hometasks/](https://github.com/sheikh-adib/JAVA-Course/tree/main/Java%20Hometasks)
      * [Homework assignment 1/]((https://github.com/sheikh-adib/JAVA-Course/tree/main/Java%20Hometasks/Homework_assignment_1))
        * [Problem 1/](https://github.com/sheikh-adib/JAVA-Course/tree/main/Java%20Hometasks/Homework_assignment_1/Problem_1)
        * [Problem 2/](https://github.com/sheikh-adib/JAVA-Course/tree/main/Java%20Hometasks/Homework_assignment_1/Problem_2)
        * [Problem 3/](https://github.com/sheikh-adib/JAVA-Course/tree/main/Java%20Hometasks/Homework_assignment_1/Problem_3)
        * [Problem 4/](https://github.com/sheikh-adib/JAVA-Course/tree/main/Java%20Hometasks/Homework_assignment_1/Problem_4)
      * Homework assignment 2/
      * [Homework assignment 3/](https://github.com/sheikh-adib/JAVA-Course/tree/main/Java%20Hometasks/Homework_assignment_3)

# Task
Task: Homework assignment 2

# Development enviroment
- Language: JAVA
- using openJDK-20
- IDE: IntelliJ

# Solution
Number of file: 1

main file: [Main.java](./src/Main.java)

Number of output file: 3 csv file:
1. [Brand1.csv](./Brand1.csv)
2. [Cars_more_than_10_years.csv](./Cars_more_than_10_years.csv)
3. [Cars_2022_price_more_than_180000.csv](./Cars_2022_price_more_than_180000.csv)

6 car are created in a list.
```java
Car(String id,String make, String model, String color, String registrationNumber, int year, double price)
```
```java
ArrayList<Car> carList = new ArrayList<>( List.of(
        new Car("001", "Brand1", "model01", "red","DO 01", 2022, 200000),
        new Car("002", "Brand1", "model02", "yellow","DO 02", 2013, 250000),
        new Car("003", "Brand2", "model01", "green","DO 03", 2022, 160000),
        new Car("004", "Brand2", "model02", "blue","DO 04", 2011, 70000),
        new Car("005", "Brand3", "model01", "black","DO 05", 2022, 300000),
        new Car("006", "Brand3", "model02", "white","DO 06", 2012, 270000)
        ));
```
### Task (a)
Saving car list on a file (csv) based on brand (Brand1 is chosen):
1. Select a brand
  ```java
  String brand = "Brand1";
  ```
2. File, writer and buffer are created
```java
File file_brand = new File(brand+".csv");
FileWriter fw_brand = new FileWriter(file_brand);
BufferedWriter bw_brand = new BufferedWriter(fw_brand);
```
3. Find the right car by iterating the car list and write it on a buffer
   ```java
   for (Car car : carList)
    {
        if (Objects.equals(car.make, brand))
        {
            bw_brand.write(car.toString());
            bw_brand.newLine();
        }
    }
    ```
4. save the file
  ```java
  bw_brand.close();
  fw_brand.close();
  ```
### Task (b)
Saving car list on a file (csv) based on period of used (more than 10 years):
1. Set minimum years and current years
  ```java
  int yearsMin = 10;
  int currentYears = 2023;
  ```
2. File, writer and buffer are created
3. Find the right car by iterating the car list and write it on a buffer
   ```java
   for (Car car : carList)
    {
        if ((currentYears - car.year + 1 )> yearsMin)
        {
            bw_years.write(car.toString());
            bw_years.newLine();
        }
    }
   ```
4. save the file

### Task (c)
Saving car list on a file (csv) based on price and year of manufacture (year: 2022, minimum price: 180000 eur):
1. Set the years of manufacture and lower bound price 
  ```java
  int year = 2022;
  int priceLowBound = 180000;
  ```
2. File, writer and buffer are created
3. Find the right car by iterating the car list and write it on a buffer
   
   ```java
   if ( car.year == year && car.price >= priceLowBound) 
    {
        bw_price.write(car.toString());
        bw_price.newLine();
    }
    ```
4. save the file.

# Output


1. 6 car are created in a list.

```
ID: 001, Make: Brand1, Model: model01, Color: red,  Registration Number: DO 01, Year: 2022, Price: 200000.0
ID: 002, Make: Brand1, Model: model02, Color: yellow,  Registration Number: DO 02, Year: 2013, Price: 250000.0
ID: 003, Make: Brand2, Model: model01, Color: green,  Registration Number: DO 03, Year: 2022, Price: 160000.0
ID: 004, Make: Brand2, Model: model02, Color: blue,  Registration Number: DO 04, Year: 2011, Price: 70000.0
ID: 005, Make: Brand3, Model: model01, Color: black,  Registration Number: DO 05, Year: 2022, Price: 300000.0
ID: 006, Make: Brand3, Model: model02, Color: white,  Registration Number: DO 06, Year: 2012, Price: 270000.0
```
2. Task (a) : list of car with brand Brand1 is listed in a csv file: [Brand1.csv](./Brand1.csv)
3. Task (b) : list of car with period of used more than 10 years is listed in a csv file: [Cars_more_than_10_years.csv](./Cars_more_than_10_years.csv)
4. Task (c) : list of car that cost more than 180000 eur and manufacture on 2022 is listed in a csv file: [Cars_2022_price_more_than_180000.csv](./Cars_2022_price_more_than_180000.csv)


