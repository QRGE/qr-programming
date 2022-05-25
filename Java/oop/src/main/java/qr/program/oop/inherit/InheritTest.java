package qr.program.oop.inherit;

import org.junit.Test;

/**
 * @Author qr
 * @Date 2022/5/25-13:20
 */
public class InheritTest {

    @Test
    public void circleTest() {
        Circle circle = new Circle(2.4);
        System.out.println(circle.getColor());
        circle.draw();
    }

    @Test
    public void ShapeTest() {
        Shape shape = new Shape();
        shape.draw();
    }
}
