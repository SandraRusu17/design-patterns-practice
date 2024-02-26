package patterns.creational.factorymethod;

public class UnknownShapeException extends RuntimeException {
    public UnknownShapeException(String message) {
        super(message);
    }
}
