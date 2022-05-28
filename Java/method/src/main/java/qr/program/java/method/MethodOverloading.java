package qr.program.java.method;

/**
 * @Author qr
 * @Date 2022/5/28-20:24
 */
public class MethodOverloading {

    public static void main(String[] args) {
        // getSum(1, 2) 会出现方法调用歧义导致编译错误
        System.out.println(getSum(1, 2.0));
    }

    public static int getSum(int a, double b) {
        return (int) (a + b);
    }

    public static int getSum(double a, int b) {
        return (int) (a + b);
    }
}
