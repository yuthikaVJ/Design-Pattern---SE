package Factory;

public class VehicleFactory {

    public Vehicle createVehicle(String type) {

        if(type.equalsIgnoreCase("CAR")){
            return new Car();
        }
        else if(type.equalsIgnoreCase("TRUCK")){
            return new Truck();
        }
        else if(type.equalsIgnoreCase("BIKE")){
            return new Bike();
        }
        else {
            return null;
        }
    }
}
