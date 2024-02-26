package patterns.creational.factorymethod;

import java.util.Arrays;
import java.util.List;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        List<ShapeFactory> shapeFactoryList = Arrays.asList(
                new CircleFactory(),
                new SquareFactory(),
                new RectangleFactory(),
                new UnknownShapeFactory()
        );

        drawShapes(shapeFactoryList);
    }

    private static void drawShapes(List<ShapeFactory> shapeFactoryList) {
        for (ShapeFactory factory : shapeFactoryList) {
            try {
                Shape shape = factory.createShape();
                shape.draw();
            } catch (UnknownShapeException e) {
                System.out.println("An exception occurred: " + e.getMessage());
            }
        }
    }
}
