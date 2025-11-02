package Factory;

public class Client {
    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.createVehicle("CAR");
        v1.drive();

        Vehicle v2 = factory.createVehicle("BIKE");
        v2.drive();

        Vehicle v3 = factory.createVehicle("TRUCK");
        v3.drive();


    }
}
