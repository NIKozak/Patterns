public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CarSelektor carSelektor = new CarSelektor();

        Car car = carSelektor.getCar(RoadType.CITY);
        car.drive();
        car.stop();

        car = carSelektor.getCar(RoadType.OFF_ROAD);
        car.drive();
        car.stop();

        car = carSelektor.getCar(RoadType.GAZON);



    }
}