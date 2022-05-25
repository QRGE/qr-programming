package qr.program.oop.execution;

import java.sql.SQLOutput;

/**
 * @Author qr
 * @Date 2022/5/25-17:25
 */
public class Base {

    public static int s;

    public int a;

    static {
        System.out.println("BaseError.StaticCodeArea, s: " + s);
        s = 1;
    }

    {
        System.out.println("BaseError.InstanceCodeArea, a: " + a);
        a = 2;
    }

    public Base() {
        System.out.println("BaseError.Construct, a: " + a);
        a = 2;
    }

    protected void step() {
        System.out.println("base s: " + s + ", a: " + a);
    }

    public void action() {
        System.out.println("----------Start----------");
        step();
        System.out.println("-----------End-----------");
    }
}
