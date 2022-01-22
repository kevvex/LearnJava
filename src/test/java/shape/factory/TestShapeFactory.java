package shape.factory;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// DEBUG MODE ENABLED USING VM ARGUMENT
// -Dorg.slf4j.simpleLogger.defaultLogLevel=DEBUG

class TestShapeFactory {
    private static final String LINE = "----------------------------------------------";
    private final static Logger LOGGER = LoggerFactory.getLogger(TestShapeFactory.class);
    private static ShapeFactory shapeFactory;

    @BeforeAll
    static void beforeClass() {
        shapeFactory = new ShapeFactory();
        LOGGER.debug(LINE);
    }

    @Test
    @DisplayName("Create circle using shape factory")
    void createCircleUsingShapeFactory() {
        LOGGER.debug("Creating a circle");
        Shape circle = shapeFactory.getShape("CIRCLE");
        Assertions.assertEquals("Circle", circle.getName());
    }

    @Test
    @DisplayName("Create square using shape factory")
    void createSquareUsingShapeFactory() {
        LOGGER.debug("Creating a square");
        Shape square = shapeFactory.getShape("SQUARE");
        Assertions.assertEquals("Square", square.getName());
    }

    @Test
    @DisplayName("Create rectangle using shape factory")
    void createRectangleUsingShapeFactory() {
        LOGGER.debug("Creating a rectangle");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Assertions.assertEquals("Rectangle", rectangle.getName());
    }

    @AfterAll
    static void afterClass() {
        shapeFactory = null;
    }
}
