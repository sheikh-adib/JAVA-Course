# Student Information

Fachhochschule Dortmund

Sheikh Muhammad Adib Bin Sheikh Abu Bakar

Student ID: 7219310

ESE student

# Task
Task: Homework assignment 3

# Development enviroment
- Language: JAVA
- using openJDK-20
- IDE: IntelliJ

# Solution
Number of file: 4

main file: [Main.java](./src/Main.java)

file 2: [Engine.java](./src/Engine.java)

file 3: [Manufacturer.java](./src/Manufacturer.java)

file 4: [Vehicle.java](./src/Vehicle.java)

## Class Diagram
![Alt text](class%20diagram.png)

## Implementation

1. [```Engine```](./src/Engine.java) and [```Manufacture```](./src/Manufacturer.java) classes have a composition relationship with vehicle class.
2. ```extend``` is used to create three engine subclasses:
   1. CombustionEngine
   2. ElectricEngine
   3. HybridEngine
   ```java
   class HybridEngine extends Engine
    {
    public int cubicCapacity = -1;
    public int kiloWatts = -1;
    }
    ```
3. All the attribute of [```Manufacture```](./src/Manufacturer.java) class are private and can only be accesses through setters and getters.
4. [```Vehicle class```](./src/Vehicle.java)  is an ```abstract``` class`. In [```Vehicle class```](./src/Vehicle.java), ```final``` key word is used for manufacturer to indicate composition relationship.
```java
public abstract class Vehicle
{
    String registrationNumber= "not registered";

    final Manufacturer manufacturer = new Manufacturer();

    public void  ShowCharacteristics()
    {
        System.out.println(manufacturer);
    }

    Vehicle(int id ,String make, int year, String color, double price)
    {
        manufacturer.setId(id);
        manufacturer.setMake(make);
        manufacturer.setYear(year);
        manufacturer.setColor(color);
        manufacturer.setPrice(price);
    }
}
```
5. manufacturer attributes of a vehicle is set during initialization of an instance.
6. The abstract method ```ShowCharacteristics``` shows the information of manufacturer attributes.
7. [```Vehicle class```](./src/Vehicle.java) has three subclasses:
   1. ICEV
   2. BEV
   3. HybridV
8. Each of the subclasses has a composition relationship with specific engine subclass ( indicate by keyword ```final```).
```java
class HybridV extends Vehicle
{
    HybridV(int id ,String make, int year, String color, double price)
    {
        super( id , make,  year,  color,  price);
    }

    final HybridEngine engine = new HybridEngine();
    
    public String toString()
    {
        return "(HybridV) Registration number: " + registrationNumber;
    }
}
```
## Simulation
1. Simulation method is in [Main.java](./src/Main.java) file.
2. A list of vehicle is created with three different type of vehicle.
```java
    ArrayList<Vehicle> vehicleArrayList = new ArrayList<Vehicle>();
    vehicleArrayList.add(new ICEV(1, "Brand1", 2023, "red", 100000));
    vehicleArrayList.add(new BEV(2, "Brand2", 2023, "yellow", 200000));
    vehicleArrayList.add(new HybridV(3, "Brand3", 2023, "green", 300000));
```
3. each vehicle is registered with a specific ```registration number```.
```java
    (vehicleArrayList.get(0)).registrationNumber = "DO 01";
    (vehicleArrayList.get(1)).registrationNumber = "DO 02";
    (vehicleArrayList.get(2)).registrationNumber = "DO 03";
```
4. Vehicle type is displayed (```classifier``` is used) before vehicle characteristic is displayed (by calling ```ShowCharacteristics()``` )
```java
    int count = 0;
    for (Vehicle veh : vehicleArrayList)
    {
        String type = null;

        if (veh instanceof ICEV)
        {
            type = "ICEV";
        }
        if (veh instanceof BEV)
        {
            type = "BEV";
        }
        if (veh instanceof HybridV)
        {
            type = "HybridV";
        }

        System.out.println("\nVehicle " + ++count + " (" + type + ")");
        veh.ShowCharacteristics();
    }
```
# Output

```

Vehicle in Vehicle list
[(ICEV) Registration number: DO 01, (BEV) Registration number: DO 02, (HybridV) Registration number: DO 03]

Vehicle 1 (ICEV)
id: 1, make: Brand1, year: 2023, color: red, price: 100000.0 eur

Vehicle 2 (BEV)
id: 2, make: Brand2, year: 2023, color: yellow, price: 200000.0 eur

Vehicle 3 (HybridV)
id: 3, make: Brand3, year: 2023, color: green, price: 300000.0 eur

Process finished with exit code 0

```

