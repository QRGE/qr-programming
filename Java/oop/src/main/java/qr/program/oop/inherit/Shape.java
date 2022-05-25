package qr.program.oop.inherit;

/**
 * @Author qr
 * @Date 2022/5/25-13:17
 */
public class Shape {

    private final static String DEFAULT_COLOR = "RED";

    private String color;

    public Shape(){
        this(DEFAULT_COLOR);
        System.out.println("Create a Shape");
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Draw a shape.");
    }
}
