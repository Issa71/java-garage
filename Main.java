package garage;

public class Main {

    public static void main(String[] args) {

        Garage g1 = new Garage();

        g1.addVehicle(g1.createVehicle("c", "BMW"));
        g1.addVehicle(g1.createVehicle("t", "BMW"));
        g1.addVehicle(g1.createVehicle("t", "Mercedes"));
        g1.printGarage(g1.vehicleCollections);

        g1.removeVehicle(g1.vehicleCollections, "BMW");
        System.out.println("");
        g1.printGarage(g1.vehicleCollections);
        
        g1.addVehicle(g1.createVehicle("c", "Audi"));
        g1.addVehicle(g1.createVehicle("c", "Audi"));
        g1.addVehicle(g1.createVehicle("c", "Audi"));
        g1.emptyGarage(g1.vehicleCollections);
        g1.printGarage(g1.vehicleCollections);
       

    }

}
