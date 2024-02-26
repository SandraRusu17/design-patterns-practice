package patterns.creational.factorymethod;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        try {
            ShapeFactory circleFactory = new CircleFactory();
            Shape circle = circleFactory.createShape();
            circle.draw();

            ShapeFactory squareFactory = new SquareFactory();
            Shape square = squareFactory.createShape();
            square.draw();

            ShapeFactory rectangleFactory = new RectangleFactory();
            Shape rectangle = rectangleFactory.createShape();
            rectangle.draw();

            ShapeFactory unknownShapeFactory = new UnknownShapeFactory();
            Shape unknownShape = unknownShapeFactory.createShape();
            unknownShape.draw();

        } catch (UnknownShapeException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }

    }
}
