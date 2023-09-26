import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        // list of vehicle
        ArrayList<Vehicle> vehicleArrayList = new ArrayList<Vehicle>();
        vehicleArrayList.add(new ICEV(1, "Brand1", 2023, "red", 100000));
        vehicleArrayList.add(new BEV(2, "Brand2", 2023, "yellow", 200000));
        vehicleArrayList.add(new HybridV(3, "Brand3", 2023, "green", 300000));

        // Vehicle registration
        (vehicleArrayList.get(0)).registrationNumber = "DO 01";
        (vehicleArrayList.get(1)).registrationNumber = "DO 02";
        (vehicleArrayList.get(2)).registrationNumber = "DO 03";

        // print vehicle list
        System.out.println( "\nVehicle in Vehicle list"+ "\n" +vehicleArrayList);

        // display characteristics of each vehicle in the list
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
    }
}
