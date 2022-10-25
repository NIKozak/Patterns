package factoryInterfaces;

import transportInterfaces.Aircraft;
import transportInterfaces.Car;

public interface TransportFactory {
    Car createCar();

    Aircraft createAircraft();


}
