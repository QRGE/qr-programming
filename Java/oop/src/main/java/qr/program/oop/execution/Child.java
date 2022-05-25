package qr.program.oop.execution;

/**
 * @Author qr
 * @Date 2022/5/25-17:25
 */
public class Child extends Base{

    public static int s;

    public int a;

    static {
        System.out.println("ChildError.StaticCodeArea, s: " + s);
        s = 10;
    }

    {
        System.out.println("ChildError.InstanceCodeArea, a: " + a);
        a = 20;
    }

    public Child() {
        System.out.println("ChildError.Construct, a: " + a);
        a = 20;
    }

    protected void step() {
        System.out.println("ChildError s: " + s + ", a: " + a);
    }

}
