package qr.program.algorithm.recursion;

/**
 * @Author qr
 * @Date 2022/5/28-20:49
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(45));
        System.out.println(fibonacci2(45));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacci2(int n) {
        return fibonacciTailRecursion(n,0,1);
    }

    /**
     * 当递归调用是方法中最后执行的语句且它的返回值不属于表达式的一部分时，这个递归调用就是尾递归。
     */
    public static int fibonacciTailRecursion(int index, int curr, int next) {
        if (index == 0) {
            return curr;
        }else {
            return fibonacciTailRecursion(index-1,next,curr+next);
        }
    }
}
