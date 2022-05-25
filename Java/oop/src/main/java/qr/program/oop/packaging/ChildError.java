package qr.program.oop.packaging;

/**
 * @Author qr
 * @Date 2022/5/25-19:09
 */
public class ChildError extends BaseError {

    private long sum;

    @Override
    public void add(int number) {
        super.add(number);
        sum += number;
    }

    @Override
    public void addAll(int[] numbers) {
        // 调用 super.addAll 里用到了 add()，由于子类重写了 add()，add() 中有 sum += number，相当于每个数被加了两次，所以这里是12
        super.addAll(numbers);
        // 正确的方法就是只在 add 中计算 sum, 即去掉下面的代码
        for (int number : numbers) {
            sum += number;
        }
    }

    public long getSum() {
        return sum;
    }
}
