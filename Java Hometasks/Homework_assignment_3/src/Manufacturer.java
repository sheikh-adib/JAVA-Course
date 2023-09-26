public class Manufacturer
{
    private int id = -1;
    private String make = "not specified";
    private int year = -1;
    private String color = "not specified";
    private double price = -1;

    public String toString()
    {
        return "id: " +  id +", make: " + make + ", year: " + year + ", color: " + color + ", price: " + price + " eur";
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public void setMake(String make)
    {
        this.make = make;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getId()
    {
        return id;
    }
    public String getMake()
    {
        return make;
    }
    public int getYear()
    {
        return year;
    }
    public String getColor()
    {
        return color;
    }
    public double getPrice()
    {
        return price;
    }
}
