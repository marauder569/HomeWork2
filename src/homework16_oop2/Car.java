package homework16_oop2;

public class Car extends Vehicle {

    public Car() {
        super("",1);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}