package transportCar;

import transportInterfaces.Car;

public class Porche implements Car {
    @Override
    public void drive() {
        System.out.println("Porche drive");
    }

    @Override
    public void stop() {
        System.out.println("Porche stopped");
    }
}
