package patterns.creational.factorymethod;

public class UnknownShapeFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        throw new UnknownShapeException("Unknown shape requested!");
    }
}
