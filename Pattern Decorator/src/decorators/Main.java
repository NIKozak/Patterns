package decorators;

import objects.Component;
import objects.Window;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Component window = new Window();
        window.draw();

        Component windowBorder = new BorderDecorator(new Window());
        windowBorder.draw();

        Component windowBorderColor = new ColorDecorator(new BorderDecorator(new Window()));
        windowBorderColor.draw();



    }
}