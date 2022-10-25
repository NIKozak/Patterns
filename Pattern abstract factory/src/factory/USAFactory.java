package factory;

import factoryInterfaces.TransportFactory;
import transportAircraft.Boing747;
import transportCar.Ford;
import transportInterfaces.Aircraft;
import transportInterfaces.Car;

public class USAFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Ford();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boing747();
    }
}
