package start;

import factory.UkrainianFactory;
import factoryInterfaces.TransportFactory;
import transportInterfaces.Aircraft;
import transportInterfaces.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello FACTORY!");

        TransportFactory ukraineFactory = new UkrainianFactory();
        Aircraft aircraft = ukraineFactory.createAircraft();
        aircraft.flight();

        Car car = ukraineFactory.createCar();
        car.drive();
        car.stop();






    }
}