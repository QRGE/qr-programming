package qr.program.java.method;

import qr.program.java.method.bean.Grand;
import qr.program.java.method.bean.Medic;
import qr.program.java.method.bean.Position;

/**
 * @Author qr
 * @Date 2022/5/28-20:24
 */
public class MethodOverloading {

    public static void main(String[] args) {
        // 方法调用传递值时基础类型可以进行隐式类型转换
        System.out.println(getDoubleSum(1, 2));
        // getSum(1, 2) 会出现方法调用歧义(可以匹配到多个方法时)导致编译错误
        System.out.println(getSum(1, 2.0));
        work1(new Grand(), new Medic());
        // 可以传递方法参数的子类
        work1(new Grand(), new Position());
    }

    public static void work1(Grand grand, Medic medic) {
        System.out.println("Grand And Medic");
    }

    public static void work1(Position position1, Position position2) {
        System.out.println("Two Operators");
    }

    public static void work1(Medic medic, Grand grand) {
        System.out.println("Medic And Medic");
    }

    public static int getSum(int a, double b) {
        return (int) (a + b);
    }

    public static double getDoubleSum(double a, double b) {
        return a + b;
    }

    public static int getIntSum(int a, int b) {
        return a + b;
    }

    public static int getSum(double a, int b) {
        return (int) (a + b);
    }
}
