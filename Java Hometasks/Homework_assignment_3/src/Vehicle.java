import java.util.ArrayList;

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

class ICEV extends Vehicle
{
    ICEV(int id ,String make, int year, String color, double price)
    {
        super( id , make,  year,  color,  price);
    }

    public String toString()
    {
        return "(ICEV) Registration number: " + registrationNumber;
    }

    final CombustionEngine engine = new CombustionEngine();
}

class BEV extends Vehicle
{
    BEV(int id ,String make, int year, String color, double price)
    {
        super( id , make,  year,  color,  price);
    }

    final ElectricEngine engine = new ElectricEngine();
    public String toString()
    {
        return "(BEV) Registration number: " + registrationNumber;
    }
}

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
