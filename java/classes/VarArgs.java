public class VarArgs {
    public static void main(String[] args) {
        System.out.println("this");

        MyMath mm = new MyMath();

        System.out.println(mm.sum(12, 23));
        System.out.println(mm.sum(12, 23, 43, 456, 45, 745, 6, 345, 34, 5));
    }
}

class MyMath {
    int sum(int... args) {
        // args => int[]
        int sum = 0;

        for (int e : args) {
            sum += e;
        }

        return sum;
    }
}