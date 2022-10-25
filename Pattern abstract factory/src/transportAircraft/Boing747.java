package transportAircraft;

import transportInterfaces.Aircraft;

public class Boing747 implements Aircraft {

    @Override
    public void flight() {
        System.out.println("Boing FLY");
    }
}
