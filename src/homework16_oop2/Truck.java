package homework16_oop2;

public class Truck extends Vehicle {

    public Truck() {
        super("truck1", 8);
    }

    public void checkEngine() {
        // Логика проверки двигателя
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
