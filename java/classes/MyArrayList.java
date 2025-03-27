
import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
    public static void main(String[] args) {
        int[] arr = { 12, 54, 363, 235, 65 };

        System.out.println(Arrays.toString(arr));

        // ArrayList<Integer> arr1 = new ArrayList<>();

        // arr1.add(1);
        // arr1.add(2);
        // arr1.add(43);

        // for (Object e : arr1) {
        // System.out.println(e);
        // }

        // arr1.remove(1);

        // System.out.println("----------------------");

        // for (Object e : arr1) {
        // System.out.println(e);
        // }

        // -------------------------------------
        ArrayList<Student10> stArr = new ArrayList<>();

        stArr.add(new Student10());
        stArr.add(new Student10());

        for (Student10 e : stArr) {
            System.out.println(e.name);
        }

    }
}

class Student10 {

    String name;
    int rollNo;

}