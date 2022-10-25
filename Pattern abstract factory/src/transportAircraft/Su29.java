package transportAircraft;

import transportInterfaces.Aircraft;

public class Su29 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Su29 FLY");
    }
}
