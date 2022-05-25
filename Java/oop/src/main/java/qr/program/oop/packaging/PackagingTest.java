package qr.program.oop.packaging;

import org.junit.Test;

/**
 * @Author qr
 * @Date 2022/5/25-19:10
 */
public class PackagingTest {

    @Test
    public void test() {
        ChildError child = new ChildError();
        child.addAll(new int[]{1,2,3});
        // 这里是12!
        System.out.println(child.getSum());
    }
}
