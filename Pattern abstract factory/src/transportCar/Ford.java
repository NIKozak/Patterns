package transportCar;

import transportInterfaces.Car;

public class Ford implements Car {

    @Override
    public void drive() {
        System.out.println("Ford drive");
    }

    @Override
    public void stop() {
        System.out.println("Ford stopped");
    }
}
