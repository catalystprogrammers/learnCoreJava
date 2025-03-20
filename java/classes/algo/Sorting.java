
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 34, 8, 3, 53, 79, 23 };

        int[] sortedArr = new int[arr.length];

        MyArr mr = new MyArr();

        for (int i = 0; i < sortedArr.length; i++) {
            int min = mr.FindMin(arr);

            // delete from previous
            int indexOfSmallest = mr.indexOfNumber(arr, min);
            arr[indexOfSmallest] = Integer.MAX_VALUE;

            // add to new
            sortedArr[i] = min;
        }

        System.out.println(Arrays.toString(sortedArr));
    }

}

class MyArr {

    int FindMin(int[] arr) {
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            int elem = arr[i];

            if (elem < smallest) {
                smallest = elem;
            }
        }

        return smallest;
    }

    int indexOfNumber(int[] arr, int elem) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                index = i;
            }
        }

        return index;
    }

}