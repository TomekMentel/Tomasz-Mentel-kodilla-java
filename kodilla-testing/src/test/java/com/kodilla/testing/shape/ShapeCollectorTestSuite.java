package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    //Test suite for classes of

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigureSquare() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(5);

        //When
        shapeCollector.addFigure(square);

        //Then
        Assert.assertEquals(1, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testAddFigureTriangle() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(4, 8);

        //When
        shapeCollector.addFigure(triangle);

        //Then
        Assert.assertEquals(1, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testAddFigureCircle() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(10);

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testRemoveCircleFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(10);
        shapeCollector.addFigure(circle);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testRemoveSquareFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(5);
        shapeCollector.addFigure(square);

        //When
        boolean result = shapeCollector.removeFigure(square);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testGetTriangleFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(4, 8);
        shapeCollector.addFigure(triangle);

        //When
        Shape retriverShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(retriverShape, triangle);
    }

    @Test
    public void testGetCircleFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(10);
        shapeCollector.addFigure(circle);

        //When
        Shape retriverShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(retriverShape, circle);

    }

    @Test
    public void testGetSquareFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(5);
        shapeCollector.addFigure(square);

        //When
        Shape retriverShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(retriverShape, square);
    }

    @Test
    public void testGetSquareField() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5);
        shapeCollector.addFigure(square);
        //When
        double squareField = square.getField();  //a*a
        //Then
        Assert.assertEquals(25, squareField, 0.01);
    }

    @Test
    public void testGetTriangleField() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(4, 8);
        shapeCollector.addFigure(triangle);
        //When
        double triangleField = triangle.getField(); //(a*h)/2
        //Then
        Assert.assertEquals(16, triangleField, 0.01);
    }

    @Test
    public void testGetCircleField() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(10);
        shapeCollector.addFigure(circle);
        //When
        double circleField = circle.getField(); //(r*r)*3.14
        //Then
        Assert.assertEquals(314.15, circleField, 0.01);
    }
}




