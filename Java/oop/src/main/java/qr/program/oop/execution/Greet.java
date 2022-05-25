package qr.program.oop.execution;

/**
 * @Author qr
 * @Date 2022/5/25-18:22
 */
public class Greet {

    static {
        System.out.println("Static.Greet");
    }

    {
        System.out.println("Instance.Greet");
    }

    public static void greet() {
        System.out.println("你好哇");
    }
}
