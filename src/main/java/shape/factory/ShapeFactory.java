package shape.factory;

class ShapeFactory {
    Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        switch (shapeType) {
            case "CIRCLE": return new Circle();
            case "SQUARE": return new Square();
            case "RECTANGLE": return new Rectangle();
        }
        return null;
    }
}
