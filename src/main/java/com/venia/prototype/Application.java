package com.venia.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HOME on 21.12.2019.
 */
public class Application {
    private List<Shape> shapes = new ArrayList<>();

    public Application() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 30;

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle.clone());
        shapes.add(anotherCircle.clone());
        shapes.add(anotherCircle.clone());

        Rectangle rectangle = new Rectangle();
        rectangle.width = 50;
        rectangle.height = 60;
        shapes.add(rectangle.clone());
        shapes.add(rectangle.clone());
        shapes.add(rectangle.clone());
        shapes.add(rectangle.clone());

        businessLogic();
    }

    private void businessLogic() {
        shapes.forEach(shape -> {
            Circle circle = null;
            Rectangle rectangle = null;
            try {
                circle = (Circle) shape;
            } catch (ClassCastException e) {
            }
            try {
                rectangle = (Rectangle) shape;
            } catch (ClassCastException e) {
            }
            if (circle != null)
                System.out.println(String.format("Circle: X=%s, Y=%s, Radius=%s", circle.x, circle.y, circle.radius));
            if (rectangle != null)
                System.out.println(String.format("Rectangle: X=%s, Y=%s, width=%s, height=%s", rectangle.x, rectangle.y, rectangle.width, rectangle.height));

        });
    }

    public static void main(String[] args) {
        Application application = new Application();
    }
}