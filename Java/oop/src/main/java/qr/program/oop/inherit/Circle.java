package qr.program.oop.inherit;

/**
 * java 是单继承的，如果想要实现多继承的效果可以了解接口
 * @Author qr
 * @Date 2022/5/25-13:22
 */
public class Circle extends Shape{

    private Double r;

    public Circle(){};

    public Circle(Double r) {
        // 子类构造需要先调用夫类的某个构造进行初始化操作
        // 如果不显示调用夫类的构造默认用夫类的空参构造(如果有)，如果没有父类的空参构造则需要显示调用 super() 且需要在子类构造方法的一行调用
        // super 关键字代指父类，可以用于调用父类构造器或者是调用父类的方法
        super("yellow"); // 调用父类的构造器
        this.r = r;
    }

    @Override
    public void draw() {
        super.draw(); // 调用父类方法
        System.out.println("Draw a circle, r=" + r);
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }


}
