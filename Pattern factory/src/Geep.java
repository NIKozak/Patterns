public class Geep implements Car {

    @Override
    public void drive() {
        System.out.println("Speed 50km");
    }

    @Override
    public void stop() {
        System.out.println("Stopped 5sec");
    }
}
