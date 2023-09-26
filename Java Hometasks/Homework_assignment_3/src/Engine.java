public class Engine
{
    String id = "not specified";
    String type = "not specified";
    int horsePower = -1;

    public void start()
    {
        System.out.println("Engine start");
    }
    public void stop()
    {
        System.out.println("Engine stop");
    }
}

class CombustionEngine extends Engine
{
    public int cubicCapacity = -1;
}

class ElectricEngine extends Engine
{
    public int kiloWatts = -1;
}

class HybridEngine extends Engine
{
    public int cubicCapacity = -1;
    public int kiloWatts = -1;
}