public class Porche implements Car {

    @Override
    public void drive() {
        System.out.println("Speed 150km");
    }

    @Override
    public void stop() {
        System.out.println("Stopped 1sec");
    }
}
