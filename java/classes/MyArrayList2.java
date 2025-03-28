
import java.util.ArrayList;

public class MyArrayList2 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(45);
        arr.add(46);
        arr.add(47);

        arr.add(1, 55); // adds new element.
        // arr.set(1, 23); // update existing element.

        arr.clear();

        for (Integer e : arr) {
            System.out.println(e);
        }

        System.out.println("size of arr: " + arr.size());
        System.out.println("is arr empty: " + arr.isEmpty());
        System.out.println("does array contains: " + arr.contains(76));

    }
}
