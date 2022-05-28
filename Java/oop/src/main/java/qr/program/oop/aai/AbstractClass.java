package qr.program.oop.aai;

import java.io.OutputStream;

/**
 * @Author qr
 * @Date 2022/5/25-21:38
 */
public abstract class AbstractClass {

    private int a;

    private static int b;

    public abstract void greet();

    public void hello() {
        System.out.println("你好哇");
    }

    public AbstractClass(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass(1) {
            @Override
            public void greet() {
                System.out.println("hello");
            }
        };
        abstractClass.hello();
    }
}
