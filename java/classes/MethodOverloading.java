public class MethodOverloading {
    public static void main(String[] args) {

        int num = 45;

        System.out.println();
        MyMath mm = new MyMath();

        int total1 = mm.sum(4, 5);
        float total = mm.sum(4.3f, 5.5f, 43.8f);

        String sum = mm.sum("one", "two");

        System.out.println(sum);
    }
}

class MyMath {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b, float c) {
        return a + b;
    }

    String sum(String a, String b) {
        return a + b;
    }

}