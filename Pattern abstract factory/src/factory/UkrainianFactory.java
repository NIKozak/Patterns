package factory;

import factoryInterfaces.TransportFactory;
import transportAircraft.Su29;
import transportCar.Porche;
import transportInterfaces.Aircraft;
import transportInterfaces.Car;

import java.util.concurrent.ThreadFactory;

public class UkrainianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new  Porche();
    }
    @Override
    public Aircraft createAircraft() {
        return new Su29();
    }
}
