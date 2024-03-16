package homework16_oop2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModelName("car1");
        car.setWheelsCount(2);

        Car car2 = new Car();
        car2.setModelName("car2");
        car2.setWheelsCount(4);

        Truck truck = new Truck();
        truck.setModelName("truck1");
        truck.setWheelsCount(6);

        Truck truck2 = new Truck();
        truck2.setModelName("truck2");
        truck2.setWheelsCount(8);

        Bicycle bicycle = new Bicycle();
        bicycle.setModelName("bicycle1");
        bicycle.setWheelsCount(2);

        Bicycle bicycle2 = new Bicycle();
        bicycle2.setModelName("bicycle2");
        bicycle2.setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}




