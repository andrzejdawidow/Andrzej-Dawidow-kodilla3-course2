package com.kodilla3.testing3.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure() {
        Shape circle = new Circle("cirle", 100);
        ShapeCollector obiekt = new ShapeCollector();
        obiekt.addFigure(circle);
        Assert.assertEquals(1, obiekt.getFiguresListQuantity());
    }
    @Test
    public void testRemoveFigure() {
        Shape triangle = new Triangle("triangle", 200);
        ShapeCollector obiekt = new ShapeCollector();
        obiekt.removeFigure(triangle);
        Assert.assertEquals(0, obiekt.getFiguresListQuantity());
    }
    @Test
    public void testGetFigure() {
        Shape tringle = new Triangle("Triangle", 300);
        Shape circle = new Circle("Circle", 400);
        ShapeCollector obiekt = new ShapeCollector();
        obiekt.addFigure(tringle);
        obiekt.addFigure(circle);
        Assert.assertEquals(circle, obiekt.getFigure(1));
    }

}
