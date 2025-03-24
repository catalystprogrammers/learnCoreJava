// Compile time error
// Runtime error

public class ExceptionHandling {
    public static void main(String[] args) {
        /**
         * Java is a Object oriented programming language (everything is in form of
         * class)
         */

        int num1 = 32;

        Character num2 = 'g';

        method1();
        method2();
        method3();
        method4();

        ExceptionHandling eh = new ExceptionHandling();

        // 1B 1000000000
    }

    static void method1() {

        int[] arr = { 4325, 6453 };

        try {
            System.out.println("open fidge");
            System.out.println(arr[1]);
            System.out.println("this is method1" + 34 / 0);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("a" + e);
        } catch (ArithmeticException e) {
            System.out.println("b" + e);
        } finally {
            System.out.println("close fridge");
        }
    }

    static void method2() {
        System.out.println("this is method2");
    }

    static void method3() {
        System.out.println("this is method3");
    }

    static void method4() {
        System.out.println("this is method4");
    }
}