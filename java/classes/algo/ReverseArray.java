import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {35, 1, 8351, 38, 13, 51};
        // 5 -> 0

        int[] arr1 = new int[arr.length];

        int lastIndex = arr.length - 1;

        for (int i = 0; i <= lastIndex; i++) {
            // i -> 0 1 2 3 4 5
            // 5 - ( 0 )
            arr1[lastIndex - i] = arr[i];
        }

        System.out.println(Arrays.toString(arr1));

    }
}
