package qr.program.oop.execution;

import org.junit.Test;

/**
 * @Author qr
 * @Date 2022/5/25-17:29
 */
public class ExecutionTest {

    @SuppressWarnings("all")
    @Test
    public void greet() {
        // 每次创建对象都会执行实例代码块的，静态代码块只会在类加载时执行一次
        new Greet().greet();
        new Greet().greet();
        new Greet().greet();
    }

    @Test
    public void test() {
        Child child = new Child();
        child.action();
    }
}
