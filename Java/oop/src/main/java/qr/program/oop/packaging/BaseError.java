package qr.program.oop.packaging;

/**
 * @Author qr
 * @Date 2022/5/25-19:07
 */
public class BaseError {

    private static final int MAX_NUM = 1000;
    private int[] arr = new int[MAX_NUM];
    private int count;

    public void add(int number) {
        if (count < MAX_NUM) {
            arr[count++] = number;
        }
    }

    public void addAll(int[] numbers) {
        for (int number : numbers) {
            add(number);
        }
    }
}
